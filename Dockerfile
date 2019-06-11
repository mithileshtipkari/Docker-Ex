FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN C:\Program Files\MongoDB\Server\3.6\bin\mongod.exe
ADD target/Docker-Trial-0.0.1-SNAPSHOT.jar /
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /Docker-Trial-0.0.1-SNAPSHOT.jar" ]