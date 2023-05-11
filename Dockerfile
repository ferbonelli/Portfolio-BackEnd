FROM amazoncorretto:17

MAINTAINER fbonelli

COPY portfoliodb/target/portfoliodb-0.0.1-SNAPSHOT.jar portfoliodb.jar

ENTRYPOINT ["java","-jar","/portfoliodb.jar"]
