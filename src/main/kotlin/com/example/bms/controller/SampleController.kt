package com.example.bms.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sample")
class SampleController {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello Sample Code."
    }
}