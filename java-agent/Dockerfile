FROM jenkins/inbound-agent:jdk21

USER root

RUN apt-get update \
    && apt-get install -y \
        maven \
        git \
        curl \
        docker.io \
    && rm -rf /var/lib/apt/lists/*

USER jenkins