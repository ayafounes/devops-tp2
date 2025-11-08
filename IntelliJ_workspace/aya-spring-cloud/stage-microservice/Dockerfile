# Start with a base image containing Java runtime
FROM openjdk:22-jdk-slim

# Information around who maintains the image
LABEL "org.opencontainers.image.authors"="aya.com"

# Add the application's jar to the image
COPY target/stage-microservice-0.0.1-SNAPSHOT.jar stage-microservice-0.0.1-SNAPSHOT.jar



# Execute the application
ENTRYPOINT ["java", "-jar", "stage-microservice-0.0.1-SNAPSHOT.jar"]
