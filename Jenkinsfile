/**
 * WebRobot.Sdk — build e deploy Maven su GitHub Packages (stesso modello di
 * rest-api/WebRobotAPIS-new: distributionManagement nel pom + withMaven + settings Jenkins).
 *
 * Il repository GitHub che ospita il codice deve coincidere con l’URL in pom.xml
 * (default WebRobot-Ltd/webrobot-sdk). Visibilità dei package = quella dei GitHub Packages
 * del repo (repo pubblico → consumo tipicamente senza login, salvo policy GitHub).
 * Il deploy è sempre autenticato (PAT nel managed settings Jenkins, server id come in Jersey).
 */
pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '15'))
        timestamps()
        timeout(time: 45, unit: 'MINUTES')
        disableConcurrentBuilds()
    }

    environment {
        GITHUB_REPOSITORY = 'WebRobot-Ltd/webrobot-sdk'
        // Stesso managed file Maven usato dalla pipeline Jersey API (server github / webrobot-ltd-repository).
        MAVEN_SETTINGS_CONFIG = '603a9990-8a95-4328-84f2-693f1c72212f'
    }

    parameters {
        booleanParam(
            name: 'RUN_TESTS',
            defaultValue: false,
            description: 'Esegui mvn test (default: solo verify con test saltati)'
        )
        booleanParam(
            name: 'DEPLOY_TO_MAVEN',
            defaultValue: false,
            description: 'mvn deploy su GitHub Packages (pom distributionManagement)'
        )
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
                script {
                    env.GIT_COMMIT_SHORT = sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
                    echo "Repository: ${env.GITHUB_REPOSITORY} @ ${env.GIT_COMMIT_SHORT}"
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    def skipTests = params.RUN_TESTS ? '' : '-DskipTests'
                    withMaven(globalMavenSettingsConfig: env.MAVEN_SETTINGS_CONFIG) {
                        sh "mvn -B clean verify ${skipTests}"
                    }
                }
            }
            post {
                always {
                    junit allowEmptyResults: true, testResults: '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Deploy to GitHub Packages') {
            when {
                expression { return params.DEPLOY_TO_MAVEN }
            }
            steps {
                script {
                    def skipTests = params.RUN_TESTS ? '' : '-DskipTests'
                    withMaven(globalMavenSettingsConfig: env.MAVEN_SETTINGS_CONFIG) {
                        sh "mvn -B deploy ${skipTests}"
                    }
                }
            }
        }
    }

    post {
        success {
            echo "OK — webrobot.eu:org.webrobot.sdk (versione dal pom). Deploy: ${params.DEPLOY_TO_MAVEN ? 'sì' : 'no'}."
        }
        failure {
            echo 'Build o deploy fallito: controllare i log Maven e il managed settings (server id webrobot-ltd-repository).'
        }
    }
}
