/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package firstGradlePlugin

import org.gradle.api.Project
import org.gradle.api.Plugin

/**
 * A simple 'hello world' plugin.
 */
class FirstGradlePluginPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        // Register a task
        project.tasks.register("greeting") { task ->
            task.doLast {
                println("Hello from plugin 'firstGradlePlugin.greeting'")
            }
        }
    }
}
