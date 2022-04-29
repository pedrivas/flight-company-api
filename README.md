# flight-company-api

## Introduction

This project has the main objective of provide interations with flight company data through skypicker api to calculate average prices of flights and bag transportation.

## Application

The application provides the functionalities:

### Calculate Average Prices

> <b>Method</b>
>> POST
>
> <b>Path</b>
>> /flight/calculateAvgPrices
> 
> <b>Description</b>
>> Make a request to the skypicker API and return the average prices of the flight and bag transportation

## 🔧 Technologies

- Java 18
- Springboot
- Hibernate
- PostgreSQL
- Docker
- Swagger
- Mockito

## 🚀 Setup

> ❗ <b> Make sure that you have Docker installed and running

><b>Build the jar file</b>
>```
>./mvnw clean package
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

## Endpoints - API Documentation

With the application running, access the below url to verify the available endpoints and api documentation

>
>> http://localhost:8888/swagger-ui/index.html#