#!/usr/bin/env groovy

import groovy.classes.Docker

def call() {
    return new Docker(this).dockerLogin()
}
