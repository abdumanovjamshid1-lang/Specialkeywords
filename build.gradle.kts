plugins {
    kotlin("jvm") version "2.2.20"
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

// Run one console exercise with: gradle runLab -Ptask=01 --console=plain
// Change task to any number from 01 to 15. Gradle must be installed.
tasks.register<JavaExec>("runLab") {
    group = "application"
    description = "Run a chosen lab task, for example -Ptask=05"
    dependsOn(tasks.named("classes"))
    val taskNumber = providers.gradleProperty("task").orElse("01").get().padStart(2, '0')
    require(taskNumber in (1..15).map { it.toString().padStart(2, '0') }) {
        "Use -Ptask=01 ... -Ptask=15"
    }
    mainClass.set("task${taskNumber}.MainKt")
    classpath = sourceSets["main"].runtimeClasspath
    standardInput = System.`in`
}
