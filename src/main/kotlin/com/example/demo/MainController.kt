package com.example.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    @Value("\${spring.application.tag}")
    private lateinit var tag: String

    @GetMapping
    fun index(): String {
        return "Latest image tag is " + tag
    }
}