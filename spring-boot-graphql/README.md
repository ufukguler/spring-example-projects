
### Graphiql URL
`http://localhost:8080/graphiql`

### example query
```
query{
  getVehicles(type: "%") {
    id
    type
    modelCode
    brandName
    launchDate
  }
}
```

### example mutations
```
mutation {
  createVehicle(vehicle: {type: "sedan", modelCode: "2020", brandName: "bmw"}) {
    id
    launchDate
    brandName
  }
}

mutation{
  createVehicle(vehicle:{ type:"hatchbag", modelCode : "2020", brandName : "audi" }){
    id,
    launchDate,
    brandName
  }
}

mutation {
  createVehicle(vehicle: {type: "station", modelCode: "2020", brandName: "volkswagen"}) {
    id
    launchDate
    brandName
  }
}
```