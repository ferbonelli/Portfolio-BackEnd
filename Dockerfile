FROM amazoncorretto:17-alpine:latest

COPY target/portfoliodb-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
