pipeline{
    agent any
    stages{
        stage("Clone"){
            steps{
                git 'https://github.com/abjeet16/in2.3.git'
            }
        }
        stage("Build project"){
            steps{
                sh 'mvn clean package'
            }
        }
        stage("Build Image"){
            steps{
                sh 'docker build -t springboot-k8s .'
            }
        }
        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
                sh 'kubectl apply -f service.yaml'
            }
        }
    }
}