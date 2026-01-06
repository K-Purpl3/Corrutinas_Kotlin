package com.hogwarts

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    println("Ej 4 App de clima concurrente")
    
    val time = measureTimeMillis {
        val temperature = async { getTemperature() }
        val humidity = async { getHumidity() }
        val wind = async { getWind() }
        
        println("Temperatura: ${temperature.await()}")
        println("Humedad: ${humidity.await()}")
        println("Viento: ${wind.await()}")
    }
    
    println("Tiempo total de ejecucion: $time ms")
}

suspend fun getTemperature(): String {
    delay(1000)
    return "25 C"
}

suspend fun getHumidity(): String {
    delay(1000)
    return "60%"
}

suspend fun getWind(): String {
    delay(1000)
    return "15 km/h"
}
