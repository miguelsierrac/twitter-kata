package com.example.core

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

/**
Feature: Publishing
Scenario: Alice publishes messages to her personal timeline.
When Alice publishes "I love the weather today." 5 minutes ago
Then Alice’s timeline has:
"I love the weather today. (5 minutes ago)"
 */
class PublishingTest {
    var timeLine = TimeLine()
    lateinit var timeLineRepository: TimeLineRepository
    lateinit var publishMessage: PublishMessage

    @Before
    fun setUp() {
        timeLineRepository = mock(TimeLineRepository::class.java)
        publishMessage = PublishMessage(timeLineRepository)
    }

    @Test
    fun firstTest() {
        //arrange
        `when`(timeLineRepository.get(anyString())).thenReturn(timeLine)
        //act
        val user = "alice"
        val message = "I love the weather today"
        publishMessage.execute(user=user, message=message)
        //assert
        assertEquals(timeLine.last(), "$message")
        verify(timeLineRepository, times(1)).get(user)
    }
}


