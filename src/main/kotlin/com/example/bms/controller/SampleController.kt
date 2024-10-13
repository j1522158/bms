package com.example.bms.controller

import com.example.bms.model.SampleModel
import com.example.bms.service.SampleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sample")
class SampleController(private val sampleService: SampleService) {

    @GetMapping("/api")
    fun hello(): List<SampleModel> {
        return sampleService.getList()
    }
}