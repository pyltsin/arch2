#!/bin/sh
while true; do
  ab -n 50 -c 5 http://myapp-hello-charts:8000/user; sleep 3
done
