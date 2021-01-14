# Simple SpringBoot + MongoApp

This is a simple SpringBoot Rest API, that connects to MongoDB image using docker-compose


## Installation

1. Clone the current repo.
2. docker-compose build && docker-compose up
3. curl -v localhost:8080/ohmygod/2 --> That returns an empty array of documents.
4. connect to mongo container using command: docker exec -it mongodbs bash
5. mongo --port 9856 && use test && db.User.insertOne({name:"Carlos", surname: "clatg"})
6. curl -v localhost:8080/ohmygod/2 --> Returns the inserted document to the dockerized mongodb
