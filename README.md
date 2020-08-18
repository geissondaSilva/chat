# Chat server API

This is a chat application developed in the rest full architecture to make available. In this project we can find the following basic features:
- User registration
- Login
- Sending and receiving messages

## Technology
The application was developed in the Java language using the spring-boot framework and the socke.io library.
For storing information, a database in postgresql.

## Run server
To run the server it is necessary to have maven and java configured in your environment. In addition to the postgresql database configured in the ![server.properties](https://github.com/geissondaSilva/chat/blob/master/chat/src/main/resources/application.properties) file. Then just run the command ```mvn spring-boot:run```. The serve is running in 'http://localhost:8080'.
