FROM amazoncorretto:8-alpine-jdk
EXPOSE 8080
MAINTAINER FJQ
COPY target/fjq-0.0.1-SNAPSHOT.jar fjq-app.jar
ENTRYPOINT ["java","-jar","/fjq-app.jar"]
