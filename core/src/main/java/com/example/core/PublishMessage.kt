package com.example.core

class PublishMessage(val timeLineRepository: TimeLineRepository) {
    fun execute(user: String, message: String) {
        val tweet = Tweet(message)

        val timeline = timeLineRepository.get(user)
        timeline?.publish(tweet)
        timeLineRepository.save(user, timeline)
    }
}
