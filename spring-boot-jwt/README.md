
you can change the credentials which are defined at:
```
MyUserDetailsService.java, line:30
```
\
\
send a POST request to:
```
http://localhost:8080/login

{
    "username" : "ufuk",
    "password" : 123
}
```
\
\
then you can get a Bearer token like this one :
```
eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1ZnVrIiwiaXNzIjoidWZ1a2d1bGVyIiwiaWF0IjoxNjAxOTI2MTkyLCJleHAiOjE2MDE5MjY0OTJ9.TJZtQILSCuT6Hq_FpwEMJ9ZdRIm-vXt3cp751CIoe9c
```
\
\
after getting your token,  send a GET request to:
```
http://localhost:8080/message
```
\
\
then you should be able to see the message
```
message
```