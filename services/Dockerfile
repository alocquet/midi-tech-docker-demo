FROM debian:jessie

# update APT && install JDK
RUN apt-get update
RUN apt-get install -y openjdk-7-jdk

# export port 8080
EXPOSE 8080

# profile. Dev par défault.
ENV PROFILE dev

# Déploiement du jar et de l'entry point
ADD ./target/services*.jar /opt/services.jar
ADD entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

# Volume des logs. Pour l'exemple...
VOLUME ["/var/log/services"]

# Execution
ENTRYPOINT ["/entrypoint.sh"]
CMD ["node-name"]
