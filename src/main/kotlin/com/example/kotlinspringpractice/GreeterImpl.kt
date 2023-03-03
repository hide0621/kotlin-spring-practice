package com.example.kotlinspringpractice

import org.springframework.stereotype.Component

@Component
class GreeterImpl: Greeter {
    override fun sayHello(name: String): String = "Hello $name"
}