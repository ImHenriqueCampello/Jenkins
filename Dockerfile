# Dockerfile

FROM eclipse-temurin:21

WORKDIR /app

COPY . .

RUN chmod +x mvnw

RUN ./mvnw clean package

CMD ["java", "-jar", "target/calculadora-1.0.jar"]