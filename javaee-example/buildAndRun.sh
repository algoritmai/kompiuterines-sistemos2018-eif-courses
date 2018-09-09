#!/bin/sh
mvn clean package && docker build -t com.mycompany/javaee-example .
docker rm -f javaee-example || true && docker run -d -p 8080:8080 -p 4848:4848 --name javaee-example com.mycompany/javaee-example 
