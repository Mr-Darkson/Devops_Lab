FROM maven:latest AS build
COPY . .
RUN mvn -T1C -fae -DskipTests clean install

FROM openjdk:latest
COPY --from=build ./target/devops-task-1.0.jar .
EXPOSE 8080
CMD ["java", "-jar", "devops-task-1.0.jar"]