package com.example.core

class TimeLine {
    private val messages = mutableListOf<Tweet>()
    
    fun last(): Any? =  messages.last()

    fun publish(message: Tweet) {
        messages.add(message)
    }

}
