FROM amazoncorretto:17

MAINTAINER fbonelli

COPY ./target/portfoliodb-0.0.1-SNAPSHOT.jar portfoliodb.jar

ENTRYPOINT ["java","-jar","/portfoliodb.jar"]
