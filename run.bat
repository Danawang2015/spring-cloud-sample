
echo off "start up spring cloud sampels"
cd eureka-server

call mvn package

call java -jar targek\eureka-server-1.0.1-SNAPSHOT.jar --spring.profiles.active=peer2

Pause
