FROM openjdk:11-slim
WORKDIR /usr/src/app
COPY src/ ./src
RUN javac src/Main.java
CMD ["tail", "-f", "/dev/null"]
