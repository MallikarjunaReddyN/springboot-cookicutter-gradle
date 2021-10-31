FROM openjdk:17-alpine
EXPOSE 8050
ARG JAR_FILE=libs
ADD libs/*.jar application.jar
ENTRYPOINT ["java","-jar","/application.jar"]