FROM openjdk:8
ADD target/api-database-server.jar api-database-server.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "api-database-server.jar"]