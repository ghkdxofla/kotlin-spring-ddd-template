package com.example.template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringApplication>(*args)
}
