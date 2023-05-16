FROM amazoncorretto:8-alpine-jdk

MAINTAINER FJQ
COPY target/fjq-0.0.1-SNAPSHOT.jar fjq-app.jar
ENTRYPOINT ["java","-jar","/fjq-app.jar"]
