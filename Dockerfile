FROM maven:3.5.2
WORKDIR /sample
COPY src /sample/src
COPY pom.xml /sample
RUN mvn -f /sample/pom.xml install



