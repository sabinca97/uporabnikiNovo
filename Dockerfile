FROM openjdk:14.0.2-jre-slim

RUN mkdir /app

WORKDIR /app

ADD ./api/target/image-catalog-api-1.0.0-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "image-catalog-api-1.0.0-SNAPSHOT.jar"]
