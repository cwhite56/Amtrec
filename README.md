# Amtrec

## Overview
This project is a spell list builder and global stat tracker for a LARP called Amtgard. It allows users to create and store their spell lists to be retrieved later. There is also a global stats page that allows users to see a statistical breakdown of what spells are being used sorted by caster class and further by kingdom and incusion rate. It uses Springboot as the backend, PostgreSQL for DB, and thymeleaf templates with JS as the frontend. It can also be deployed to AWS using RDS and Elastic Beanstalk. 
## Purpose
The purpose of this project was to widen my understanding of backend API design by creating my own front end and hitting the endpoints myself. I also wanted to learn more about user authentication in Springboot. I initially took the JWT authentication approach. Upon realizing this was overkill, I switched to basic and form login. 
## Usage
To use this project, first start the local database image using `docker compose up`. Start the application by running `mvn spring-boot:run`. You may then log into local host at port 8080 in a web browser. You can navigate the page from there. 
### Status
This project is fully functional and currently deployed. Beta testing with a small group of players in progress.