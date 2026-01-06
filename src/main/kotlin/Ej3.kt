package com.hogwarts

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Ej3 Api lenta")
    
    println("Solicitando datos a la API")
    val data = fetchDataFromApi()
    println("Datos recibidos: $data")
}

suspend fun fetchDataFromApi(): String {
    delay(2000) //"latencia" de red
    return "{ \"usuario\": \"Harry Potter\", \"casa\": \"Gryffindor\" }"
}
