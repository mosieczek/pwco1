FROM openjdk:8u191-jdk-alpine3.9
ADD target/pwco1-0.0.1-SNAPSHOT.jar .
EXPOSE 8002
CMD java -jar pwco1-0.0.1-SNAPSHOT.jar