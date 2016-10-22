# build org.svenehrke:fregelib:1.0-SNAPSHOT
cd fregelib
./gradlew clean jar install
cd ..

# use fregelib from java
cd javaapp
./gradlew run
cd ..

# use fregelib from scala/spray
cd scalaspray
sbt run
open browser at: http://localhost:8080/sayhelloto?name=sven
...which should display: Hello sven from spray-routing Hi from Frege Hi from Frege Hi from Frege Hi from Frege Hi from Frege on spray-can !

