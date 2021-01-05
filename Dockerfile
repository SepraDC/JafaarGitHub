FROM tomcat

COPY target/JafaarGitHub.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
