FROM debian:jessie

# update APT && install JDK
RUN apt-get update
RUN apt-get install -y openjdk-7-jdk

# export port 80
EXPOSE 80

# profile. Dev par défault.
ENV PROFILE dev

# Déploiement du jar
ADD ../../target/*.jar /opt/services.jar

# Volume des logs. Pour l'exemple...
VOLUME ["/var/log/services"]

# Execution
ENTRYPOINT ["java", "-jar", "/opt/services.jar", "fr.gfi.miditech.ServicesApplication", "-D", "spring.profiles.active=$PROFILE"]
CMD ["node-name"]