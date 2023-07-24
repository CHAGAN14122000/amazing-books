FROM openjdk:11
LABEL maintainer="abhishekparab1412000@gmail.com"
WORKDIR /app
ADD target/apiGateway-1.0.jar apiGateway-1.0.jar
ENV ACTIVE_PROFILE dev
ENTRYPOINT ["java", "-jar","apiGateway-1.0.jar","--spring.profiles.active=${ACTIVE_PROFILE}"]
EXPOSE 8181