FROM maven:3-openjdk-11 as builder
WORKDIR /tmp/api-sample1
COPY . .
RUN mvn clean package

FROM adoptopenjdk:11-jre-openj9
COPY --from=builder /tmp/api-sample1/target/api-sample1-1.0.0-SNAPSHOT.jar /
CMD ["java","-jar","/api-sample1-1.0.0-SNAPSHOT.jar"]

