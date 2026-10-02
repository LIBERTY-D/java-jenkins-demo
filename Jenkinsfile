pipeline {

    agent {
        label 'java'
    }

    options {
        timestamps()
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the Java application...'
                sh '''
                 java --version

                '''
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh '''
                  mvn --version
                '''
            }
        }

        stage('Build image') {
            steps {
                echo 'Building Docker image...'
                sh '''
                docker --version
                '''
            }
        }

        stage('Archive') {
            steps {
                echo 'Archiving JAR file...'

            }
        }

        stage('Deploy stage') {
            steps {
                echo 'Deploying application...'
            }
        }
    }
}