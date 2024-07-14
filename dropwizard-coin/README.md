# dropwizard_lays

How to start the dropwizard_lays application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/dropwizard-coin-0.0.1-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`


How to build and run the container
---
1. Start your Docker Desktop
1. Open your terminal (I am using PowerShell)
1. type cd (file directionary of the dropwizard-coin folder)
1. type docker build -t container-name
1. type docker run -p 8000:8080 container-name


How to test the application
---
You will be able to connect to it using POSTMAN

1. Set the query to POST
1. THE URL should be http://localhost:8000/api/count 
1. Click Body
1. Select raw, ensure the format(last col on right) is JSON
1. Write JSON into the input { "coinstype": [0.01,0.20, 0.50, 1, 5, 10], "targetAmt": 9.28 }