FROM ubuntu:latest
LABEL authors="AnhMaiTuan"

RUN apt-get update && \
    apt-get install -y openjdk-11-jre-headless && \
    apt-get clean;

ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-amd64
RUN export JAVA_HOME

COPY ./src/ex4 /home/root/src

CMD [ "java", "/home/root/src/MainTest.java" ]
