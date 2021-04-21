package com.example.core

data class Tweet(val message: String) {
    init {
        if(message.length > 280) {
            throw ExceedLimitMessageError()
        }
    }
}

class ExceedLimitMessageError: Exception()