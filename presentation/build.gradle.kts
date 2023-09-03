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

    /* spring */
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
}
