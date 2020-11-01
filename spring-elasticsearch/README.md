# elastic search:
## install elasticsearch-docker
`docker-compose -f spring-elasticsearch/src/main/resources/docker-compose.yml up -d`

## check elastic search
`http://localhost:9200/`
## send get request
`localhost:8080/kisi/{value}`