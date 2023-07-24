FROM openjdk:11
LABEL maintainer="abhishekparab1412000@gmail.com"
WORKDIR /app
ADD target/configServer-1.0.jar configServer-1.0.jar
ENV ACTIVE_PROFILE dev
ENTRYPOINT ["java", "-jar","configServer-1.0.jar","--spring.profiles.active=${ACTIVE_PROFILE}"]
EXPOSE 8070