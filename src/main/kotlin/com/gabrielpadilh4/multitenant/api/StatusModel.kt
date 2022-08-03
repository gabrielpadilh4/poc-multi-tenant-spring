package com.gabrielpadilh4.multitenant.api

import org.springframework.http.HttpStatus

data class StatusModel(
    var code: Int,
    var message: String,
    var timestamp: Long = System.currentTimeMillis()
) {
    constructor(code: Int) : this(code, HttpStatus.valueOf(code).reasonPhrase, System.currentTimeMillis())

    init {
        timestamp = System.currentTimeMillis()
    }
}