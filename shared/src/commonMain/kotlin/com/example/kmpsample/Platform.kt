package com.example.kmpsample

expect class Platform {
    val osName: String
    val osVersion: String
    val deviceModel: String
    val density: Int
    fun logSystem()
}