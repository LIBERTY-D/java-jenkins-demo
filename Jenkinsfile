pipeline {

    agent {
        label 'java'
    }

    parameters {
        string(
            name: 'DOCKER_IMAGE',
            defaultValue: 'jenkins-java-demo:1.0',
            description: 'Enter the Docker image name and tag, for example:
            jenkins-java-demo:1.0'
        )
    }

    options {
        timestamps()
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building the Java application...'
                sh '''
                    java --version
                    mvn clean package -DskipTests
                '''
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh '''
                    mvn test
                '''
            }
        }

        stage('Build image') {
            steps {
                echo "Building Docker image: ${params.DOCKER_IMAGE}"

                sh '''
                    docker --version
                    docker build -t "$DOCKER_IMAGE" .
                '''
            }
        }

        stage('Archive') {
            steps {
                echo 'Archiving JAR file...'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Deploy stage') {
            steps {
                echo "Deploying ${params.DOCKER_IMAGE}..."
            }
        }
    }
}