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
                sh 'docker compose run --rm container-test'
            }
        }

        stage('Build') {
            steps {
                sh 'docker compose run --rm container-build'
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