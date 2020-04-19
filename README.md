Установка config
` kubectl apply -f config.yaml`
Postgres
`kubectl apply -f postgres.yaml `
Запуск job
`kubectl apply -f initdb.yaml `

Запуск сервиса
` kubectl apply -f deployment.yaml -f Service.yaml -f ingress.yaml`

Настроить параметр baseUrl в postman коллекции:
otus.postman_collection.json