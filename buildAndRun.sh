#!/bin/sh
mvn clean install && sudo docker build -t evandromoura/agix:1.9 . && sudo docker push evandromoura/agix:1.9