package com.example.core

interface TimeLineRepository {
    fun get(user: String): TimeLine?
    fun save(user: String, timeline: TimeLine?)
}
