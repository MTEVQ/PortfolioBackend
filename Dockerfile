FROM amazoncorretto:19-alpine-jdk

COPY target/demo2-0.0.1-SNAPSHOT.jar appi.jar

ENTRYPOINT ["java","-jar","/appi.jar"]

