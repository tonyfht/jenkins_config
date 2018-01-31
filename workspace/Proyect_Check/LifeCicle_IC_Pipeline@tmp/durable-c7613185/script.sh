#!sh -xe
"C://Software//apache-maven-3.5.0//bin"/mvn install sonar:sonar -Dmaven.test.failure.ignore=true -f fuentes/pom.xml -U