pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hello World -Build'
            }
        }
        stage('Test') {
            steps {
                echo 'Test Execution '
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy on prodqa '
            }
        }
		
		
       
        }
		post {

                success {
                             emailext body: '', subject: 'Status for piple jobs', to: 'surajgit12@gmail.com'
                }
            }
		
    }
