#/bin/sh
docker run -d --name "services" --link database:database -e PROFILE=prod -p 8080:8080 alocquet/midi-tech-first:1.0 node0
