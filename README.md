# cvcc-student-crud

## Introduction
This is Cinglevue Code Challenge - A single page web app using following technologies:

- **AngularJS** - MV* framework
- **Spring MVC** - Serve static contents and expose REST apis
- **Spring Data v** - Used to access MongoDB
- **MongoDB** - The document database
- **NodeJS, ExpressJS, Gulp** - Used to rapidly develop frontend without backend server

## How to run
		$>mongod
		$>git clone https://github.com/hvogit/cvcc-student-crud.git
		$>cd cvcc-student-crud
		$>mongoimport -d hieudb -c students students.json  (optional)
		$>mvn tomcat7:run

		Open in browser:
		http://localhost:8080

## Screenshots
![list](https://github.com/hvogit/cvcc-student-crud/raw/master/src/main/webapp/images/list.png)
![detail](https://github.com/hvogit/cvcc-student-crud/raw/master/src/main/webapp/images/detail.png)

https://github.com/hvogit/cvcc-student-crud/raw/master/src/main/webapp/images/details.png
