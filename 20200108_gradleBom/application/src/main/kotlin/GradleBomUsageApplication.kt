package com.github.jangalinski.devnull

import mu.KLogging


fun main(args: Array<String>) {
    MyApp().hello(if (args.isEmpty()) "Jan" else args[0])
}

class MyApp {
    companion object : KLogging()

    fun hello(name: String) {
        logger.info { "well, hello, $name!" }
    }
}
