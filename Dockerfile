FROM tomcat
MAINTAINER Senniinn
# COPY path-to-your-application-war path-to-webapps-in-docker-tomcat
COPY target/pizza-spring-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/