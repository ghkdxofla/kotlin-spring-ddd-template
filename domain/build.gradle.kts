plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("plugin.spring")
    kotlin("jvm")
}

tasks.bootJar { enabled = false }
tasks.jar { enabled = true }
