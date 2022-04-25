# flight-company-api

## Introduction

This project has the main objective of provide interations with flight company data through skypicker api to calculate average prices of flights and bag transportation.


## 🔧 Technologies

- Java 18
- Springboot
- Hibernate
- PostgreSQL
- Docker

## 🚀 Setup

> ❗ <b> Make sure that you have Docker installed and running

><b>Build the jar file</b>
>```
>./mvnw clean package -DskipTests
>```
><b>Copy the generate file to the docker folder</b>
>```
>cp target/flightcompany-0.0.1-SNAPSHOT.jar src/main/docker
>```
><b>Go to the docker folder and initialize the docker compose</b>
>```
>cd .\src\main\docker\
>docker compose up
>```