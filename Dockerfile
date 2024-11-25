FROM eclipse-temurin:17
COPY target/bike.jar bike.jar
CMD ["java","-jar","bike.jar"]

ENV spring.datasource.url=jdbc:mysql://localhost:3306/bike
ENV spring.datasource.username=root
ENV spring.datasource.password = root