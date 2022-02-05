FROM openjdk:11-ea-11-jdk-slim

ADD ./build/libs/*.jar app.jar

EXPOSE 80

ENTRYPOINT ["java","-jar","/app.jar"]