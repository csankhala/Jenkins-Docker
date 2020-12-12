pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('SpringBoot-Angular-Docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/csankhala/SpringBoot-Angular-Gradle.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
