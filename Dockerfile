FROM maven:latest AS build
WORKDIR /app
COPY pom.xml .
COPY src/ src/
RUN mvn package

FROM openjdk:latest
WORKDIR /app
COPY --from=build /app/target/devops-task-1.0.jar .
EXPOSE 8080
CMD ["java", "-jar", "devops-task-1.0.jar"]