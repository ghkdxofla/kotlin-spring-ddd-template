package com.example.template.converter

import com.example.template.command.GreetingFetchCommand
import com.example.template.request.GreetingFetchRequest
import com.example.template.response.GreetingFetchResponse
import com.example.template.result.GreetingFetchResult

fun GreetingFetchRequest.toCommand(): GreetingFetchCommand =
    GreetingFetchCommand(
        id=greetingId
    )

fun GreetingFetchResult.toResponse(): GreetingFetchResponse =
    GreetingFetchResponse(
        greeting=greeting
    )
