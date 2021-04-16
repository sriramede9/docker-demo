# docker-demo

## Initial Script for Docker file 

 

### FROM openjdk:8-jdk-alpine 

 
 

### COPY target/demo-docker-0.0.1-SNAPSHOT.jar demo-docker-0.0.1-SNAPSHOT.jar 

### ENTRYPOINT ["java","-jar","/demo-docker-0.0.1-SNAPSHOT.jar"] 

 

 

The above will suffice once you have packaged your application and here we are copying from target to current folder 

Entry points will start if no active profiles are given when spinning the image 

 

Syntax to Set Active Profile 

 

## docker build --tag=demo-docker:latest . 

 

Once you have built the image with tag 

 

Use This to set Active Profile 

 

## docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8800:8080 -t demo-docker:latest 

### To Run in detached mode

 ## docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8800:8080 -d demo-docker:latest 

Please refer to : Dockerize - reference - spring 

 

For java –jar environment refer to : java -jar application.jar --spring.profiles.active=prod : Stack-overflow-link 
