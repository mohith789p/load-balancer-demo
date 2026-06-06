package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.http.ContentType

fun main() {
    // Bind to 0.0.0.0 to ensure the container accepts external routing
    embeddedServer(Netty, port = 8083, host = "0.0.0.0") {
        routing { 
            get("/") { call.respondText("<h1>Hello from KOTLIN Server.</h1>", ContentType.Text.Html) } 
        }
    }.start(wait = true)
}