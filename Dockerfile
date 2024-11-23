FROM eclipse-temurin:17
COPY target/devops.jar bike.jar
CMD ["java","-jar","bike.jar"]