FROM openjdk:26-ea-17-jdk-oracle

WORKDIR /app

COPY target/LAB7_20221747-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]