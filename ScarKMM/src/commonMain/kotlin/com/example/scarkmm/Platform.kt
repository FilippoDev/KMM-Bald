package com.example.scarkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform