FROM eclipse-temurin:17
COPY target/bike.jar bike.jar
CMD ["java","-jar","bike.jar"]