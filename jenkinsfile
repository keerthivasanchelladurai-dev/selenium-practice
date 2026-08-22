pipeline{
    agent any
    stages
    {
        stage('checkout'){
            steps{
                checkout scm
            }
        }

        stage('Build and test'){
            steps{
                bat 'mvn clean test'
            }
        }
    }
}