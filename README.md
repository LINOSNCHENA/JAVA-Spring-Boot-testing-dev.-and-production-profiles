# DEVELOPMENT VS TESTING vs PRODUCTION ENVIROMENT 

Separations of the three parts of the software cycle. The development is separated from testing which is separe from the production. This remove built-in errors when the two are separated. The use of a separate  Virtual machibne or another machine is recommended


## Executing the application

1. Clone the repository 
2. Update the dependancies in Maven POM.
3. Table pages 3+2+10
4. Change particular values in application.properties
5. To compile the application run the first command below.
6. Resources; Dev=h2, Test = Postgresql , Prod=MySQL

## Execution commands:  

```
mvn clean package
mvn spring-boot:run

```

## Links for the development and deployment version

Open [http://localhost:8080/](http://localhost:8080/) in browser to see the application.

## Interface UX

 Below are some Screens shots from the application

![ Application Singleton Interface page #3 ](https://github.com/(1).png)
