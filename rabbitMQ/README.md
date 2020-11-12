### docker compose file
```
# docker-compose -f rabbitMQ/src/main/resources/docker-compose.yml up
```

#### RabbitMQ web interface
```
http://localhost:15672

username: user
password: 123
```


#### output
```
### notification ID: 67458d3b-9ce3-492e-a01c-f6fd29b9027b
notification received...
Notification{notificationId='67458d3b-9ce3-492e-a01c-f6fd29b9027b', createdAt=Thu Nov 12 14:07:19 TRT 2020, seen=false, message='hosgeldinnn'}

### notification ID: 2318259b-d9f0-4dc3-9c8e-c4afa3244eb2
notification received...
Notification{notificationId='2318259b-d9f0-4dc3-9c8e-c4afa3244eb2', createdAt=Thu Nov 12 14:07:22 TRT 2020, seen=false, message='hosgeldinnn'}

### notification ID: 0c6e7df1-920f-443b-a17b-311be1f02084
notification received...
Notification{notificationId='0c6e7df1-920f-443b-a17b-311be1f02084', createdAt=Thu Nov 12 14:07:25 TRT 2020, seen=false, message='hosgeldinnn'}

```