/**
 * WebRobot.Sdk — allineato a rest-api/WebRobotAPIS-new/Jenkinsfile:
 * agent Kubernetes, container maven:3.9.11-amazoncorretto-17, PVC .m2 condiviso,
 * withMaven(globalMavenSettingsConfig) per build/deploy su Maven Central (Sonatype OSS, host s01).
 *
 * Versione Maven (pom ${revision}): ogni run CI usa -Drevision univoca (default 0.3.<BUILD_NUMBER>).
 * Il managed settings (MAVEN_SETTINGS_CONFIG) può contenere mirror/proxy senza segreti Sonatype.
 * Deploy: credenziale Jenkins «Username with password» — ID in Jenkins: `sonatype-ossrh` (param
 * SONATYPE_CREDENTIALS_ID, default uguale). Maven: overlay con <server><id>ossrh</id> (deve matchare il pom).
 */
pipeline {
    agent {
        kubernetes {
            yaml '''
apiVersion: v1
kind: Pod
metadata:
  namespace: cicd
spec:
  containers:
  - name: maven
    image: maven:3.9.11-amazoncorretto-17
    command:
    - sleep
    args:
    - 99d
    resources:
      requests:
        memory: "2Gi"
        cpu: "1000m"
        ephemeral-storage: "2Gi"
      limits:
        memory: "4Gi"
        cpu: "2000m"
        ephemeral-storage: "4Gi"
    volumeMounts:
    - name: maven-repo
      mountPath: /root/.m2/repository
  volumes:
  - name: maven-repo
    persistentVolumeClaim:
      claimName: maven-repo-pvc
'''
            defaultContainer 'maven'
        }
    }

    environment {
        GITHUB_REPOSITORY = 'WebRobot-Ltd/webrobot-sdk'
        MAVEN_SETTINGS_CONFIG = '603a9990-8a95-4328-84f2-693f1c72212f'
    }

    parameters {
        booleanParam(
            name: 'RUN_TESTS',
            defaultValue: false,
            description: 'Eseguire lo stage Unit Tests (mvn test) prima del build'
        )
        booleanParam(
            name: 'DEPLOY_TO_MAVEN',
            defaultValue: false,
            description: 'Deploy del package Maven su Maven Central / Sonatype OSS (distributionManagement nel pom)'
        )
        string(
            name: 'MAVEN_REVISION',
            defaultValue: '',
            trim: true,
            description: 'Versione Maven completa (es. 0.4.1). Vuoto = auto 0.3.<BUILD_NUMBER> (nuova versione ad ogni build).'
        )
        string(
            name: 'SONATYPE_CREDENTIALS_ID',
            defaultValue: 'sonatype-ossrh',
            trim: true,
            description: 'Jenkins credential ID (Username with password) per Sonatype OSS — server Maven id ossrh'
        )
    }

    options {
        timeout(time: 45, unit: 'MINUTES')
        disableConcurrentBuilds()
        buildDiscarder(logRotator(numToKeepStr: '15'))
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    def scmVars = checkout scm
                    env.GIT_COMMIT = scmVars.GIT_COMMIT
                    env.GIT_COMMIT_SHORT = scmVars.GIT_COMMIT ? scmVars.GIT_COMMIT.take(8) : 'unknown'
                    def manualRev = params.MAVEN_REVISION?.trim()
                    env.MAVEN_REVISION = manualRev ? manualRev : "0.3.${env.BUILD_NUMBER}"
                    echo "Checkout ${env.GITHUB_REPOSITORY} @ ${env.GIT_COMMIT_SHORT}"
                    echo "Maven -Drevision=${env.MAVEN_REVISION}"
                }
            }
        }

        stage('Setup Environment') {
            steps {
                container('maven') {
                    sh 'java -version'
                    sh 'mvn -version'
                    sh 'pwd && ls -la'
                }
            }
        }

        stage('Unit Tests') {
            when {
                expression { params.RUN_TESTS }
            }
            steps {
                container('maven') {
                    script {
                        echo 'Esecuzione test unitari...'
                        withMaven(globalMavenSettingsConfig: env.MAVEN_SETTINGS_CONFIG) {
                            sh "mvn -B test -Drevision=${env.MAVEN_REVISION}"
                        }
                        echo 'Test unitari completati'
                    }
                }
            }
        }

        stage('Build Maven') {
            steps {
                container('maven') {
                    script {
                        echo 'Build WebRobot.Sdk (verify, test saltati come in Jersey API)...'
                        withMaven(globalMavenSettingsConfig: env.MAVEN_SETTINGS_CONFIG) {
                            sh "mvn -U -B clean verify -DskipTests -Drevision=${env.MAVEN_REVISION}"
                        }
                    }
                }
            }
        }

        stage('Deploy to Maven Central') {
            when {
                expression { return params.DEPLOY_TO_MAVEN }
            }
            steps {
                container('maven') {
                    script {
                        echo 'Deploy: credenziale Jenkins deve usare Central PORTAL user token (https://central.sonatype.com/usertoken) — token OSSRH legacy → 401.'
                        echo "Overlay ossrh: credential ${params.SONATYPE_CREDENTIALS_ID} + managed global ${env.MAVEN_SETTINGS_CONFIG}"
                        def esc = { String s ->
                            if (s == null) {
                                return ''
                            }
                            return s.replace('&', '&amp;')
                                .replace('<', '&lt;')
                                .replace('>', '&gt;')
                                .replace('"', '&quot;')
                                .replace('\'', '&apos;')
                        }
                        withCredentials([usernamePassword(credentialsId: params.SONATYPE_CREDENTIALS_ID, usernameVariable: 'OSSRH_USER', passwordVariable: 'OSSRH_PASS')]) {
                            def u = (env.OSSRH_USER ?: '').trim()
                            def p = (env.OSSRH_PASS ?: '').trim()
                            if (!u || !p) {
                                error("Credenziale '${params.SONATYPE_CREDENTIALS_ID}': username o password vuoti dopo trim. Tipo Jenkins: «Username with password» (non Secret text).")
                            }
                            echo "Sonatype: lunghezze token (diagnostica) user=${u.length()} pass=${p.length()} — se deploy 401 qui è ok ma Sonatype rifiuta: rigenera Portal user token (https://central.sonatype.com/usertoken), non token OSSRH legacy."
                            writeFile file: 'jenkins-ossrh-overlay-settings.xml', text: """<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.2.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.2.0 https://maven.apache.org/xsd/settings-1.2.0.xsd">
  <servers>
    <server>
      <id>ossrh</id>
      <username>${esc(u)}</username>
      <password>${esc(p)}</password>
    </server>
  </servers>
</settings>
"""
                            withMaven(globalMavenSettingsConfig: env.MAVEN_SETTINGS_CONFIG, mavenSettingsFile: "${env.WORKSPACE}/jenkins-ossrh-overlay-settings.xml") {
                                sh "mvn -B deploy -DskipTests -Drevision=${env.MAVEN_REVISION}"
                            }
                        }
                    }
                }
            }
        }
    }

    post {
        success {
            echo "OK — webrobot.eu:org.webrobot.sdk revision ${env.MAVEN_REVISION}. Deploy: ${params.DEPLOY_TO_MAVEN ? 'sì' : 'no'}."
        }
        failure {
            echo 'Build o deploy fallito: log Maven, credential SONATYPE_CREDENTIALS_ID, managed global settings, firma GPG e requisiti Central (sources/javadoc se richiesti).'
        }
    }
}
