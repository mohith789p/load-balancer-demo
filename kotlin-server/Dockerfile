FROM gradle:8.7-jdk21-alpine
WORKDIR /home/kotlin/app
COPY . .
RUN gradle build -x test --no-daemon
EXPOSE 8083
CMD ["java", "-jar", "build/libs/kotlin-server-all.jar"]