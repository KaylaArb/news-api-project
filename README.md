# News API Project

Application consuming REST API https://newsapi.org/ in order to display news from a specified country and category.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 
See deployment for notes on how to deploy the project on a live system.

### Prerequisites

[Java 14](https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html) \
[Node.js](https://nodejs.org/en/)

### Installing

To install this example application, run the following commands:

```bash
git clone https://github.com/KaylaArb/news-api-project.git
cd news
```

This will get a copy of the project installed locally. To install all of its dependencies and start each app, follow the instructions below.

To run the server, cd into the `application` folder and run:
 
```bash
mvn spring-boot:run
```

To run the client, cd into the `web` folder and run:
 
```bash
npm install && npm start
```


## Running the tests

```bash
mvn: test
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **K.A.** - *Initial work* - [KaylaArb](https://github.com/KaylaArb)

