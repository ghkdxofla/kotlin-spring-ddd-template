plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("plugin.spring")
    kotlin("jvm")
}

tasks.bootJar { enabled = false }
tasks.jar { enabled = true }

dependencies {
    /* sub-projects */
    implementation(project(":domain"))
    implementation(project(":infrastructure"))

    /* spring */
    implementation("org.springframework:spring-context")
    implementation("org.springframework:spring-tx")
}
