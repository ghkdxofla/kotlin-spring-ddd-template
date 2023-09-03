package com.example.template.service

import com.example.template.entity.Greeting

class GreetingService {
    fun getGreetingById(id: String): Greeting =
        Greeting(
            id=id,
            person="tester",
            message="Greetings",
        )
}
