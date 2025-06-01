# ---------- Stage 1: Build the application ----------
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app

# Copy all project files
COPY . .

# Build the application
RUN mvn clean package -DskipTests

# ---------- Stage 2: Run the application ----------
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the jar from the previous stage
COPY --from=builder /app/target/Assignment-0.0.1-SNAPSHOT.jar app.jar

# Expose port (match this with your app's server.port if it's not 8080)
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
