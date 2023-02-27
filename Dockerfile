#FROM amazoncorretto:19-alpine-full
FROM azul/zulu-openjdk-alpine:19-latest

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ARG CONFIG=src/main/resources/application.properties
COPY ${CONFIG} application.properties

EXPOSE 13337/tcp

ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]