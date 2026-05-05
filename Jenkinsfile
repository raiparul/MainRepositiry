pipeline {
    agent any

    triggers {

        cron('H 2 * * *')
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Running build step'
                bat 'mvn clean test'
            }
        }
    }
}