FROM openjdk:17-alpine
WORKDIR /app
COPY target/pokechallenge-0.0.1-SNAPSHOT.war pokechallenge.war
EXPOSE 80
CMD ["java", "-jar", "-Dspring.profiles.active=aws", "pokechallenge.war"]