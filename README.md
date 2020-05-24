Spring Boot - Rest  CRUD with Swagger
====================================

swagger UI - 
http://localhost:9090/swagger-ui.html#/


    curl -X GET "http://localhost:9090/employee/list"
    
    [
    {
    "id": 1,
    "name": "Ram",
    "age": 24
    },
    {
    "id": 2,
    "name": "Adam",
    "age": 35
    },
    {
    "id": 3,
    "name": "Robert",
    "age": 33
    }
    ]
----
   
    curl -X GET "http://localhost:9090/employee/1" -H "accept: */*"
    
    {
    "id": 1,
    "name": "Ram",
    "age": 24
    }
---    
    curl -X GET "http://localhost:9090/employee/drop/2" -H "accept: */*"
    deleted
    
    curl -X GET "http://localhost:9090/employee/list"

    [
    {
    "id": 1,
    "name": "Ram",
    "age": 24
    },
    {
    "id": 3,
    "name": "Robert",
    "age": 33
    }
    ]
---    
    curl -X POST "http://localhost:9090/employee/save/" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"age\": 25, \"id\": 4, \"name\": \"VIJAY\"}"
    Saved Employee :Employee{id=4, name='VIJAY', age=25}

