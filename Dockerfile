FROM openjdk:8-jdk-alpine
VOLUME /Desktop/Mahima/vol
RUN mongod --fork --logpath /var/log/mongod.log && mongo --eval "use docker-trial"
ADD target/Docker-Trial-0.0.1-SNAPSHOT.jar /
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /Docker-Trial-0.0.1-SNAPSHOT.jar" ]
