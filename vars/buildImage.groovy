#!/usr/bin/env groovy

import groovy.classes.Docker

def call(String imageName) {
    return new Docker(this).buildDockerImage(imageName)
}

