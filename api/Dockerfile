FROM openjdk:21-jdk

USER app

COPY ./target/api-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "/app.jar" ]