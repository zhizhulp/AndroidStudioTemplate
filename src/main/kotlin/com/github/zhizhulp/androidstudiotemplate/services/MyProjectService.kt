package com.github.zhizhulp.androidstudiotemplate.services

import com.github.zhizhulp.androidstudiotemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
