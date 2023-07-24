FROM openjdk:11
LABEL maintainer="abhishekparab1412000@gmail.com"
WORKDIR /app
ADD target/serviceRegistry-1.0.jar serviceRegistry-1.0.jar
ENV ACTIVE_PROFILE dev
ENTRYPOINT ["java", "-jar","serviceRegistry-1.0.jar","--spring.profiles.active=${ACTIVE_PROFILE}"]
EXPOSE 8761