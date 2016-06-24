#!/bin/sh
java -Dspring.profiles.active=$PROFILE -jar /opt/services.jar fr.gfi.miditech.ServicesApplication
