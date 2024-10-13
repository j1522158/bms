package com.example.bms.service

import com.example.bms.enumration.SampleEnum
import com.example.bms.model.SampleModel
import org.springframework.stereotype.Service

@Service
class SampleService {
    private val sampleList = listOf(
        SampleModel(1, "name1", SampleEnum.ACTIVE),
        SampleModel(2, "name2", SampleEnum.ACTIVE),
        SampleModel(3, "name3", SampleEnum.INACTIVE)
    )

    fun getList(): List<SampleModel> {
        return sampleList
    }
}