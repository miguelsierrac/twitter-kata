package com.example.core

class PublishMessage(val timeLineRepository: TimeLineRepository) {
    fun execute(user: String, message: String) {
        val timeline = timeLineRepository.get(user)
        timeline?.publish(message)
        timeLineRepository.save(user, timeline)
    }
}
