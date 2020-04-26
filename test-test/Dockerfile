FROM alpine:3.4

WORKDIR /app

RUN apk --no-cache add \
        apache2-utils

COPY dockerrun.sh /usr/local/bin/dockerrun.sh
RUN chmod +x /usr/local/bin/dockerrun.sh
CMD ["dockerrun.sh"]
