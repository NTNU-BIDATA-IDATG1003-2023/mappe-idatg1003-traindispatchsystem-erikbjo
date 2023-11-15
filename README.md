# Train Dispatch System 🚂

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/HVrmLnmo)

STUDENT NAME = Erik Bjørnsen  
STUDENT ID = erbj

![Java shield](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven shield](https://img.shields.io/badge/Apache_Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Spring boot shield](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![IDE](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

## Project description

Train Dispatch System is a system for dispatching trains. It only shows the trains connected with Oslo S.

## How to run the project

1. Clone the repository

```bash
git clone git@github.com:NTNU-BIDATA-IDATG1003-2023/mappe-idatg1003-traindispatchsystem-erikbjo.git
```

2. Compile the program with:

```bash
./mvnw clean install
```

3. Run the program with:

```bash
java -jar target/tds-*version*.jar
```

or

1. Download the jar file from git or with this command:

```bash
wget https://github.com/NTNU-BIDATA-IDATG1003-2023/mappe-idatg1003-traindispatchsystem-erikbjo/releases/ *FIX THIS*
```

2. Run the program with:

```bash
java -jar tds-*version*.jar
```

## How to run the tests

1. Clone the repository
2. Run the tests with:

```bash
mvn test
```

## Project structure

```
root
├── src
│   ├── main
│   │   ├── java
│   │   │   └── no
│   │   │       └── ntnu
│   │   │           └── erbj
│   │   │               └── tds
│   │   │                   ├── dao
│   │   │                   │   ├──DAO.java
│   │   │                   │   ├──DepartureDAO.java
│   │   │                   │   ├──StationDAO.java
│   │   │                   │   ├──TrainDAO.java
│   │   │                   │   └──WagonDAO.java
│   │   │                   │
│   │   │                   ├── model
│   │   │                   │   ├── Departure.java
│   │   │                   │   ├── DepartureBuilder.java
│   │   │                   │   ├── Station.java
│   │   │                   │   ├── Train.java
│   │   │                   │   ├── Wagon.java
│   │   │                   │   └── WagonType.java
│   │   │                   │
│   │   │                   ├── shared
│   │   │                   │   └── utilites
│   │   │                   │       ├── StringValidator.java
│   │   │                   │       └── TimeParser.java
│   │   │                   │
│   │   │                   ├── ui
│   │   │                   │   ├── commands
│   │   │                   │   │   ├── CreateCommands.java
│   │   │                   │   │   ├── DepartureCommands.java
│   │   │                   │   │   ├── TimeCommands.java
│   │   │                   │   │   ├── TrainCommands.java
│   │   │                   │   │   └── WagonCommands.java
│   │   │                   │   │
│   │   │                   │   ├── controllers
│   │   │                   │   │   └── TimeController.java
│   │   │                   │   │
│   │   │                   │   └── utilites
│   │   │                   │       ├── ANSIColors.java
│   │   │                   │       ├── Colorize.java
│   │   │                   │       ├── SortUtility.java
│   │   │                   │       └── TdsLogger.java
│   │   │                   │
│   │   │                   └── TdsApplication.java (main class)
│   │   └── resources
│   │       ├── logback.xml
│   │       └── application.properties
│   │
│   └── test
│       └── java
│           └── no
│               └── ntnu
│                   └── erbj   
│                       └── tds
│                           ├── dao
│                           │   ├── StationDAOTest.java
│                           │   ├── DepartureDAOTest.java
│                           │   ├── TrainDAOTest.java
│                           │   └── WagonDAOTest.java
│                           │
│                           └── model
│                               ├── DepartureBuilderTest.java
│                               ├── DepartureTest.java
│                               ├── StationTest.java
│                               ├── TrainTest.java
│                               └── WagonTest.java
├── .gitignore
├── LICENSE
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Link to repository

[GitHub Classroom](https://github.com/NTNU-BIDATA-IDATG1003-2023/mappe-idatg1003-traindispatchsystem-erikbjo)

## References
