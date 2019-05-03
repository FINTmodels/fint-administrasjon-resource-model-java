pipeline {
    agent { 
        docker {
            label 'docker'
            image 'gradle:4.6.0-jdk8-alpine'
        }
    }
    stages {
        stage('Build') {
            steps {
                timeout(10) {
                    waitUntil {
                        script {
                            def r = sh returnStatus: true, script: 'gradle --no-daemon clean build'
                            return r == 0
                        }
                    }
                }
                stash includes: 'build/libs/*.jar', name: 'libs'
            }
        }
        stage('Deploy') {
            environment {
                BINTRAY = credentials('fint-bintray')
            }
            when {
                branch 'master'
            }
            steps {
                unstash 'libs'
                archiveArtifacts 'build/libs/*.jar'
                sh 'gradle --no-daemon -PbintrayUser=${BINTRAY_USR} -PbintrayKey=${BINTRAY_PSW} bintrayUpload'
            }
        }
    }
}
