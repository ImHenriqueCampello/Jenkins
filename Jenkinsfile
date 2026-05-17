pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Testes') {
            steps {
                sh '''
                    docker run --rm \
                    -v "$PWD":/app \
                    -w /app \
                    maven:3.9-eclipse-temurin-21 \
                    mvn test
                '''
            }
        }

        stage('Build') {
            steps {
                sh '''
                    docker build -t calculadora .
                '''
            }
        }
    }

    post {
        success {
            echo 'Pipeline executada com sucesso!'
        }

        failure {
            echo 'Pipeline falhou!'
        }
    }
}