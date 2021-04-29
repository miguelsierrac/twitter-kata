package com.example.core

import com.google.common.truth.ExpectFailure
import com.google.common.truth.Truth.assertThat
import net.bytebuddy.utility.RandomString
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

/*
 Scenario: Bob can view Alice’s timeline.
      Given Alice has published "I love the weather today." 5 minutes ago
      When Bob views Alice's timeline
      Then Bob sees:
         I love the weather today. (5 minutes ago)

*/
class ReadingTest {
lateinit var timeLineRepository: TimeLineRepository

    @Before
    fun setUp() {
        timeLineRepository = mock(TimeLineRepository::class.java)
    }

    @Test
    fun readingTimeLineTest() {
        var timeLine = TimeLine()
        timeLine.publish(Tweet("I love the weather today."))

        `when`(timeLineRepository.get(anyString())).thenReturn(timeLine)
        val user = "alice"

        var timeLineAlice = ReadMessage.execute(user = user)

        assertEquals(timeLineAlice.last(), Tweet("I love the weather today."))
    }
}