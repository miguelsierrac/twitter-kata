package com.example.core

class TimeLine {
    private val messages = mutableListOf<String>()
    
    fun last(): Any? =  messages.last()

    fun publish(message: String) {
        messages.add(message)
    }

}
