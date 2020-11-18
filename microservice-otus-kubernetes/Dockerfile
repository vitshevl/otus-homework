FROM alpine:3.11

RUN apk add openjdk11-jre

ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk
ENV PATH=$JAVA_HOME/bin:$PATH

EXPOSE 8000
ENV APP_HOME /app

LABEL Maintainer: Shevliagin Viktor

#Create base app folder
RUN mkdir $APP_HOME
#Create folder to save configuration files
RUN mkdir $APP_HOME/config
#Create folder with application logs
RUN mkdir $APP_HOME/log

#Copy executable jar file from the builder image
COPY *.jar $APP_HOME/microservice-otus-kubernetes-0.0.1-SNAPSHOT.jar
WORKDIR $APP_HOME

ENTRYPOINT [ "sh", "-c", "java -jar microservice-otus-kubernetes-0.0.1-SNAPSHOT.jar"]