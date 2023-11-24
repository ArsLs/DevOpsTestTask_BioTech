FROM openjdk:17
COPY target/HelloWorldSpringWebApp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
