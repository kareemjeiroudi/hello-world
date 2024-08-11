package com.kareemjeiroudi.helloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class Hello {

    @GetMapping("/")
    fun hello(): String {
        return "Hello world"
    }
}