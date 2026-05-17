pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Debug') {
            steps {
                sh '''
                    ls
                    pwd
                    find /var/jenkins_home/workspace/Calculadora -name pom.xml
                '''
            }
        }

        stage('Testes') {
            steps {
                sh '''
                    docker run --rm \
                    -v /var/jenkins_home/workspace/Calculadora:/app \
                    -w /app \
                    maven:3.9-eclipse-temurin-21 \
                    mvn test
                '''
            }
        }
    }
}