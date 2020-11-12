## redis cache with spring boot

#### docker redis
`
docker run -p 6379:6379 --name my-redis -d redis
`

---

#### response time - before cache
![first request](firstRequest.png)

#### response time - after cache
![](cache.png)
