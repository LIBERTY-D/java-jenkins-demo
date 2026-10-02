@echo off

docker run ^
  --network jenkins-network ^
  --name jenkins-java-agent ^
  -v /var/run/docker.sock:/var/run/docker.sock ^
  jenkins-java-agent:1.0 ^
  -url http://jenkins-container:8080/ ^
  -secret 45d3ecd620c60a060700638d1594a679e6955d91b2e0f3a49f328ae9c5401fce  ^
  -name "java-agent" ^
  -webSocket ^
  -workDir "/home/jenkins/agent"

pause

