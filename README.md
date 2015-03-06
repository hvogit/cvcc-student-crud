# cvcc-student-crud

## Introduction
This is Cinglevue Coding Challenge - A single page web app using following technologies:

- **AngularJS** - MV* framework
- **Spring MVC** - Serves static contents and exposes REST apis
- **Spring Data** - Used to access MongoDB
- **MongoDB** - Document database
- **NodeJS, ExpressJS, Gulp** - Used to rapidly develop frontend without backend server

## How to run
		$> mongod
		$> git clone https://github.com/hvogit/cvcc-student-crud.git
		$> cd cvcc-student-crud
		$> mongoimport -d hieudb -c students students.json  (optional)
		$> mvn tomcat7:run

		Open in browser:
		http://localhost:8080

## Screenshots
![list](https://github.com/hvogit/cvcc-student-crud/raw/master/src/main/webapp/images/list.png)
![detail](https://github.com/hvogit/cvcc-student-crud/raw/master/src/main/webapp/images/details.png)
