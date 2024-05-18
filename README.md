# HelloWorld API

## Overview

This is a simple Spring Boot application that demonstrates basic API creation and testing using Maven. The application includes two endpoints:

- `/hello`: A GET endpoint that returns "hello world".
- `/login`: A POST endpoint that accepts a JSON object with `username` and `password` fields and returns a success or error message based on the credentials.

## Prerequisites

- Java 17
- Maven 3.6+
- Git (optional, for cloning the repository)

## Project Structure
```bash
src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── helloworldapi
│   │               ├── HelloWorldApiApplication.java
│   │               ├── HelloWorldController.java
│   │               └── LoginController.java
│   └── resources
│       └── application.properties
└── test
    └── java
        └── com
            └── example
                └── helloworldapi
                    ├── HelloWorldControllerTest.java
                    └── LoginControllerTest.java

```


## Setup and Running

### Clone the Repository

```bash
git clone https://github.com/yourusername/helloworld-api.git
cd helloworld-api
```

### Build the Project

```bash
mvn clean install
```

### Running Tests
```bash
mvn test
```

### Running Tests
```bash
mvn spring-boot:run
or
java -jar <TARGET_JAR>
```