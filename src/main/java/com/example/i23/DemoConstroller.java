package com.example.i23;

//docker login
//docker tag <local-image>:<tag> <dockerhub-username>/<repository>:<tag>
//docker push yourusername/springboot-k8s:latest

//Step 6: Update deployment.yaml
//
//Instead of:
//
//image: springboot-k8s:latest
//imagePullPolicy: Never
//
//use:
//
//image: yourusername/springboot-k8s:latest
//imagePullPolicy: Always
public class DemoConstroller {
    /*
    minikube start
    kubectl get nodes
    minikube stop
minikube delete
minikube start --driver=docker
    sudo mkdir -p /var/lib/jenkins/.kube
    sudo cp ~/.kube/config /var/lib/jenkins/.kube/config
    sudo chown -R jenkins:jenkins /var/lib/jenkins/.kube
    sudo cp -r ~/.minikube /var/lib/jenkins/
    sudo chown -R jenkins:jenkins /var/lib/jenkins/.minikube

    sudo chmod o+x /home/abjeet
sudo chmod -R o+rx /home/abjeet/.kube
sudo chmod -R o+rx /home/abjeet/.minikube
sudo chmod -R o+r /home/abjeet/.minikube/profiles/minikube
sudo chmod -R o+r /home/abjeet/.minikube/profiles/minikube/client.key
    * */
}
