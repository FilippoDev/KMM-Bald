package com.example.scarkmm

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Bald Scar, ${platform.name}!"
    }
}