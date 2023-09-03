package com.example.template.web

import com.example.template.converter.toCommand
import com.example.template.converter.toResponse
import com.example.template.request.GreetingFetchRequest
import com.example.template.service.GreetingApplicationService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingWebService(
    private val greetingApplicationService: GreetingApplicationService
) {
    @GetMapping("/api/v1/greetings/{greeting-id}")
    fun fetchGreetingById(
        @PathVariable("greeting-id") greetingId: String,
    ): ResponseEntity<Any> {
        val request = GreetingFetchRequest(
            greetingId=greetingId,
        )

        val command = request.toCommand()

        val result = greetingApplicationService.fetchGreeting(
            command=command
        )

        val response = result.toResponse()

        return ResponseEntity(response, HttpStatus.OK)
    }
}
