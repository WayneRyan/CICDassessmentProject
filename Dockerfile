FROM openjdk:11
COPY /target/spring-boot-final-project.jar .
CMD ["java", "-jar", "spring-boot-final-project.jar"]