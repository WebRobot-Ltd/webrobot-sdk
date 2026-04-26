/**
 * WebRobot.Sdk — allineato a rest-api/WebRobotAPIS-new/Jenkinsfile:
 * agent Kubernetes, container maven:3.9.11-amazoncorretto-17, PVC .m2 condiviso,
 * withMaven(globalMavenSettingsConfig) per build/deploy su GitHub Packages.
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
            description: 'Deploy del package Maven su GitHub Packages (distributionManagement nel pom)'
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
                    echo "Checkout ${env.GITHUB_REPOSITORY} @ ${env.GIT_COMMIT_SHORT}"
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
                            sh 'mvn -B test'
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
                            sh 'mvn -U -B clean verify -DskipTests'
                        }
                    }
                }
            }
        }

        stage('Deploy to GitHub Packages') {
            when {
                expression { return params.DEPLOY_TO_MAVEN }
            }
            steps {
                container('maven') {
                    script {
                        echo 'Deploy su GitHub Packages...'
                        withMaven(globalMavenSettingsConfig: env.MAVEN_SETTINGS_CONFIG) {
                            sh 'mvn -B deploy -DskipTests'
                        }
                    }
                }
            }
        }
    }

    post {
        success {
            echo "OK — webrobot.eu:org.webrobot.sdk. Deploy: ${params.DEPLOY_TO_MAVEN ? 'sì' : 'no'}."
        }
        failure {
            echo 'Build o deploy fallito: log Maven e managed settings (server webrobot-ltd-repository).'
        }
    }
}
