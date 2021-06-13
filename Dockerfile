FROM openjdk:8-jdk-alpine
RUN mkdir -p /testapp
ADD target/*.jar /testapp/
CMD java -Dserver.port=$PORT $JAVA_OPTS -jar app.jar
