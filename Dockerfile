FROM openjdk:8-jdk-alpine
ARG JAR_FILE=backend/target/*.jar
COPY ${JAR_FILE} app.jar
CMD java -Dserver.port=$PORT $JAVA_OPTS -jar app.jar
