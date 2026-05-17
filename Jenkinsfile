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
                    -v /var/jenkins_home/workspace/Calculadora:/app \
                    -w /app/Calculadora \
                    maven:3.9-eclipse-temurin-21 \
                    mvn test
                '''
            }
        }

        stage('Build') {
            steps {
                sh '''
                    cd Calculadora

                    mvn clean package

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