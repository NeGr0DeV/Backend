FROM eclipse-temurin:27-jdk-alpine AS builder
WORKDIR /build
COPY . .
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:27-jre-alpine
WORKDIR /app
COPY --from=builder /build/target/*.jar app.jar

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

EXPOSE 80
ENTRYPOINT ["java", "-jar", "app.jar"]