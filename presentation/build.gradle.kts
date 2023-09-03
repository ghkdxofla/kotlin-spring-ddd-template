import org.gradle.jvm.tasks.Jar

plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("plugin.spring")
    kotlin("jvm")
}

// delete plain.jar
tasks.getByName<Jar>("jar") {
    enabled = false
}

java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
    /* sub-projects */
    implementation(project(":application"))
    implementation(project(":domain"))
    implementation(project(":infrastructure"))
}
