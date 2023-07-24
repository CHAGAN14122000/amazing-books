FROM openjdk:11
LABEL maintainer="abhishekparab1412000@gmail.com"
WORKDIR /app
ADD target/oauthServer-1.0.jar oauthServer-1.0.jar
ENV ACTIVE_PROFILE dev
ENTRYPOINT ["java", "-jar","oauthServer-1.0.jar","--spring.profiles.active=${ACTIVE_PROFILE}"]
EXPOSE 8030