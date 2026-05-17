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
                sh 'mvn test'
            }
        }

        stage('Build') {
            steps {
                sh 'docker build -t calculadora .'
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