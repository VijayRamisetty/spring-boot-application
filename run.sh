rm tmp/myapp.log
#mvn clean install -DskipTests=true
mvn clean install
java -jar  -Dspring.config.location=./  -Dspring.profiles.active=dev   target/spring-boot-application-0.0.1-SNAPSHOT.jar --server.port=9090