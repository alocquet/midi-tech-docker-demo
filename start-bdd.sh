#/bin/sh
docker run -d --name "database" -p 5432:5432 -e POSTGRES_USER=miditech -e POSTGRES_PASSWORD=miditech postgres:9.5.3
