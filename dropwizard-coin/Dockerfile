FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/*.jar

COPY ./target/dropwizard-coin-0.0.1-SNAPSHOT.jar app.jar

COPY config.yml config.yml

ENTRYPOINT ["java", "-jar", "app.jar", "server","config.yml"]


