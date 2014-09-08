## Install in Ubuntu 12.04 Desktop (For Developer)

Prerequisite:

- ant1.7

sudo apt-get install ant1.7

- svn-buildpackage

sudo apt-get install svn-buildpackage

- curl

sudo apt-get install curl

- junit

sudo apt-get install junit

- maven3 (remove maven2 if you have installed before, using sudo apt-get purge maven2)

sudo -H gedit /etc/apt/sources.list 

Add the following line in the bottom:

deb http://ppa.launchpad.net/natecarlson/maven3/ubuntu precise main

deb-src http://ppa.launchpad.net/natecarlson/maven3/ubuntu precise main

sudo apt-get update and then you can find maven3 in install list

(if encounter GPG error, please follow to solve)

apt-key adv --keyserver keyserver.ubuntu.com --recv-keys B70731143DD9F856

apt-get updateKind regards

- httpcore

git clone https://github.com/apache/httpcore

mvn3 install (if fails, use mvn3 compiler:compile instead of)

cp httpcore/target/httpcore-4.3.3-SNAPSHOT.jar /usr/share/java/httpcore.jar

- httpclient

git clone https://github.com/apache/httpclient

mvn3 install (make sure you are in the directory of commons-logging)

cp httpclient/target/httpclient-4.3.6-SNAPSHOT.jar /usr/share/java/httpclient.jar

- commons-logging

git clone https://github.com/apache/commons-logging

mvn3 install (make sure you are in the directory of commons-logging)

cp commons-logging-1.2.1-SNAPSHOT.jar /usr/share/java/commons-logging.jar

- JSON-java

git clone https://github.com/douglascrockford/JSON-java

cd JSON-java

mkdir -p org/json

cp *.java org/json

mv zip org/json

javac -Xlint org/json/*.java org/json/zip/*.java

jar -cvf json.jar org/json/*.class org/json/zip/*.class

cp json.jar /usr/share/java/json.jar
