package com.example.bms.model

import com.example.bms.enumration.SampleEnum

data class SampleModel(
    /**
     * sample id
     */
    val id: Long,

    /**
     * sample name
     */
    val name: String,

    /**
     * sample enum
     */
    val status: SampleEnum
)