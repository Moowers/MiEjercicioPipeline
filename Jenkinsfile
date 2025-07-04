pipeline {
    agent any
    
    tools {
        // Define the Maven tool installation to use
        maven 'Maven 3'
        jdk 'JDK 8'
    }
    
    stages {
        stage('Checkout') {
            steps {
                // Get code from the repository
                checkout scm
                echo 'Code checkout completed'
            }
        }
        
        stage('Build') {
            steps {
                // Run Maven compile
                sh 'mvn clean compile'
                echo 'Build completed'
            }
        }
        
        stage('Test') {
            steps {
                // Run Maven test
                sh 'mvn test'
                echo 'Tests completed'
            }
            post {
                always {
                    // Publish JUnit test results
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
        
        stage('Package') {
            steps {
                // Run Maven package
                sh 'mvn package -DskipTests'
                echo 'Package completed'
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
