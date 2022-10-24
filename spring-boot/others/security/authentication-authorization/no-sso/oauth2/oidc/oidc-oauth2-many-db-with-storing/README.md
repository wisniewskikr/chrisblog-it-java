DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to implement **client authentication** with **database** or **OAuth2** type **Facebook, Google and Github** with **custom** Login page using **Java** application with **Spring Boot** framework. Additionally all information about users - from database or OAuth2 - are **stored** in database.

##### Details
This application works in following way:
* **Input**: user tries to display "Hello World" page in browser. If user is not logged in then he/she has to log in using either database or Facebook/Google/Github account.
* **Action**: Application redirects user to Facebook/Google/Github if he/she is not logged in. Otherwise it displays "Hello World" page. All information about users are stored in database
* **Output**: Page "Hello World" is displayed

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This application uses:
* **Spring Boot** framework: `https://docs.google.com/document/d/1mvrJT5clbkr9yTj-AQ7YOXcqr2eHSEw2J8n9BMZIZKY/edit?usp=sharing`
* **Security**: `https://docs.google.com/document/d/1nhPRbfD10KJOYsgI1HUwUz95ReiJPbXK85_zMyAptoY/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)
* Installed **Java** (tested on version 1.8.0_291). Tool details: `https://docs.google.com/document/d/119VYxF8JIZIUSk7JjwEPNX1RVjHBGbXHBKuK_1ytJg4/edit?usp=sharing`
* Installed **Maven** (tested on version 3.8.5). Tool details: `https://docs.google.com/document/d/1cfIMcqkWlobUfVfTLQp7ixqEcOtoTR8X6OGo3cU4maw/edit?usp=sharing`
* Installed **Git** (tested on version 2.33.0.windows.2). Tool details: `https://docs.google.com/document/d/1Iyxy5DYfsrEZK5fxZJnYy5a1saARxd5LyMEscJKSHn0/edit?usp=sharing`

##### Preconditions - Actions
* **Download** source code and open any **Command Line** tool on **project's folder**. You can do it in following way:
    * Open any Command Line tool (for instance "Windonw PowerShell" on Windows OS) and go to folder where you want to download source code 
    * Clone Github repository with `git clone https://github.com/wisniewskikr/chrisblog-it.git`
    * Go to source code folder with `cd chrisblog-it\java-springboot-security-client-authentication\springboot-security-api-client-authentication-form-oauth2-many-db-with-storing`
* **Configure** Facebook, Google and Github as Identity Providera. Instructions how to do it you can find here: `https://docs.google.com/document/d/1nhPRbfD10KJOYsgI1HUwUz95ReiJPbXK85_zMyAptoY/edit?usp=sharing`
* **Update file application.properties** with Facebook, Google and Github Identity Providers data


USAGE
-----

Usage steps:
1. Start application with `mvn spring-boot:run`
1. Visit (use database user/password credentials or Facebook/Google/Github credentials) `http://localhost:8080`
1. (Optional) Check database content with `http://localhost:8080/h2-console`
1. Clean up environment with `ctrl + C`