# Train Dispatch System 🚂

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/HVrmLnmo)

STUDENT NAME = Erik Bjørnsen  
STUDENT ID = erbj

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
│   │   │                   │   ├──StationDAO.java
│   │   │                   │   ├──DepartureDAO.java
│   │   │                   │   ├──TrainDAO.java
│   │   │                   │   └──WagonDAO.java

/* TODO: FIX THIS */

│   │   │                   ├── model
│   │   │                   │   ├── Station.java
│   │   │                   │   ├── Departure.java
│   │   │                   │   ├── DepartureBuilder.java
│   │   │                   │   ├── Train.java
│   │   │                   │   ├── TrainBuilder.java (maybe to be removed)
│   │   │                   │   ├── WagonType.java
│   │   │                   │   └── Wagon.java
│   │   │                   │
│   │   │                   └── TdsApplication.java (main class)
│   │   └── resources
│   │       ├── logback.xml
│   │       └── application.properties
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
│                               ├── StationTest.java
│                               ├── DepartureTest.java
│                               ├── DepartureBuilderTest.java
│                               ├── TrainTest.java
│                               └── WagonTest.java
├── pom.xml
├── README.md
├── LICENSE
├── mvnw
├── mvnw.cmd
└── .gitignore
```

## Link to repository

[GitHub Classroom](https://github.com/NTNU-BIDATA-IDATG1003-2023/mappe-idatg1003-traindispatchsystem-erikbjo)

## References
