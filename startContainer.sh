#!/bin/sh
set -e
exec "java" "-jar" "/var/lib/account-api-microservice-0.0.1-SNAPSHOT" "$@"
exec "$@"
