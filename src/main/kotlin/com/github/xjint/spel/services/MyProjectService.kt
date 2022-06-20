package com.github.xjint.spel.services

import com.intellij.openapi.project.Project
import com.github.xjint.spel.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
