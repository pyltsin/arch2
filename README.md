Запуск prometheus
helm install prom stable/prometheus-operator -f prometheus.yaml --atomic

Запуск ingress
helm install nginx stable/nginx-ingress -f nginx-ingress.yaml --atomic

Запуск нагрузки
kubectl apply -f  ad.yaml 

Запуск приложения
helm install myapp ./hello-chart --atomic