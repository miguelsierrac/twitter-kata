package com.example.core

class TimeLine {
    private val messages = mutableListOf<Tweet>()
    
    fun last(): Tweet? =  messages.last()

    fun publish(message: Tweet) {
        messages.add(message)
    }
}
