//Punto de partida
FROM amazoncorreto:11-alpine-jdk
//Dueño
MAINTAINER FJQ
//Github-empaquetado
COPY target/fjq-0.0.1-SNAPSHOT.jar fjq-app.jar
//instruccion primaria
ENTRYPOINT ["java","-jar","/fjq-app.jar"]
