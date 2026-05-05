pipeline {
    agent any

    triggers {
        cron('H 2 * * *')
    }

    tools {
        maven 'Maven-3'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                echo 'Running Maven build'
                bat 'mvn clean test'
            }
        }
    }
}