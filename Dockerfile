FROM openjdk:11
WORKDIR /usr/src/agix
COPY kubernetes/guava.jar /usr/src/agix
COPY kubernetes/asterisk-java.jar /usr/src/agix
COPY target/classes/fastagi-mapping.properties /usr/src/agix
COPY target/agix-1.0.jar /usr/src/agix/agix.jar

CMD ["java", "-cp", "asterisk-java.jar:guava.jar:agix.jar","org.asteriskjava.fastagi.DefaultAgiServer"]