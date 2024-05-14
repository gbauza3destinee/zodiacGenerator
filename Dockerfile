
FROM openjdk:17
WORKDIR /app
COPY target/Zodiac-0.0.1-SNAPSHOT.jar /app/Zodiac-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar", "Zodiac-0.0.1-SNAPSHOT.jar"]
