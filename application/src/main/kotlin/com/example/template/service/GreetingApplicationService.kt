package com.example.template.service

import com.example.template.command.GreetingFetchCommand
import com.example.template.result.GreetingFetchResult
import org.springframework.stereotype.Service

@Service
class GreetingApplicationService {
    fun fetchGreeting(command: GreetingFetchCommand): GreetingFetchResult {
        val greeting = GreetingService().getGreetingById(id=command.id)

        return GreetingFetchResult(
            greeting = "${greeting.message}, ${greeting.person}[${greeting.id}]!"
        )
    }


}
