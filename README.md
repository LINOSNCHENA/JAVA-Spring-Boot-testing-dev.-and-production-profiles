# DEVELOPMENT,TESTING vs PRODUCTION 

Separation of the three parts of the software cycle. The development enviroment is separated from testing, which is the separated from the production enviroment. This remove built-in errors when the three are separated. The use of a separate  Virtual Machibne or another machine is recommended for the cycle.


## Executing the application

1. Clone the repository 
2. Update the dependancies in Maven POM.
3. Change particular values in application.properties
4. To compile the application run the first command below.
5. Resources;  Dev = Postgresql ,Test=h2, Prod=MySQL

## Execution commands:  

```
mvn clean package
mvn spring-boot:run

```

## Links for the development and deployment version

Open [http://localhost:8080/](http://localhost:8080/) in browser to see the application.

## Interface UX

 Below are some Screens shots from the application

![ Application Singleton Interface page #3 ](https://github.com/LINOSNCHENA/JAVA-Springboot-Testing-and-Development-Profiles/blob/master/uXviews/page%20(1).png)
![ Application Singleton Interface page #3 ](https://github.com/LINOSNCHENA/JAVA-Springboot-Testing-and-Development-Profiles/blob/master/uXviews/page%20(2).png)
![ Application Singleton Interface page #3 ](https://github.com/LINOSNCHENA/JAVA-Springboot-Testing-and-Development-Profiles/blob/master/uXviews/page%20(3).png)
