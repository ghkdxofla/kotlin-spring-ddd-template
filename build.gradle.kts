import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    /* Core plugins */
    java
    idea

    /* Kotlin plugins */
    kotlin("jvm") version "1.9.10"
    kotlin("plugin.spring") version "1.9.10" apply false

    /* Spring plugins */
    id("org.springframework.boot") version "3.1.3" apply false
    id("io.spring.dependency-management") version "1.1.3" apply false
}

allprojects {
    group = "com.example.template"
    version = "0.0.1-SNAPSHOT"

    System.setProperty("kotlin-coroutines.version", "1.7.3")

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    repositories {
        mavenCentral()
    }
}

kotlin {
    jvmToolchain {
        this.languageVersion.set(JavaLanguageVersion.of("17"))
    }
}
