## Rest Client w/ Spring Boot

#### run postgresql data jpa rest api 
```
$  cd ../spring-postgresql-datajpa/src/main/resources/docker-compose.yml
$  docker-compose up
```

#### run rest-client
```
$  mvn spring:boot run
```
---
### Requests
```
GET:
http://localhost:8081/test  (rest client)
http://localhost:8080/kisi  (rest api)
```
result:
```
[
   {
      "id":1,
      "adi":"ufuk",
      "soyadi":"guler",
      "adres":[
         "adres 1",
         "adres 2"
      ]
   },
   {
      "id":2,
      "adi":"ali",
      "soyadi":"veli",
      "adres":[
         "adres 3",
         "adres 4"
      ]
   },
   {
      "id":3,
      "adi":"test",
      "soyadi":"8081",
      "adres":[
         "adres 5",
         "adres 6"
      ]
   }
]
```
---
```
POST:
http://localhost:8081/test  (rest client)
http://localhost:8080/kisi  (rest api)
{
        "adi": "john",
        "soyadi": "doe",
        "adres": [
            "adres 1",
            "adres 2"
        ]
    }
```
result:
```
[
   {
      "id":4,
      "adi": "john",
      "soyadi": "doe",
      "adres": [
        "adres 1",
        "adres 2"
      ]
   }
]
```