FROM maven:3.5.0-jdk-8-alpine

#Create cached tmp directory
WORKDIR /tmp

#Copy Source Files
WORKDIR /src
COPY ./src ./src
COPY ./.classpath .
COPY ./pom.xml .
COPY .project .

#Build Java Project
RUN mvn package

ENTRYPOINT ["java","-jar","/src/target/CarApp-0.0.1-SNAPSHOT.jar"]