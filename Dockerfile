FROM tomcat
LABEL maintainer="northcorp software limited"
ADD ./target/vecvdemo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
