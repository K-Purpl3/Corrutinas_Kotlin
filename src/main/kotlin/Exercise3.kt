package com.hogwarts

import kotlinx.coroutines.*

// 3️⃣ Simulación de API lenta
fun main() = runBlocking {
    println("--- Inicio de simulación de API lenta ---")
    
    println("Solicitando datos a la API...")
    val data = fetchDataFromApi()
    println("Datos recibidos: $data")
}

suspend fun fetchDataFromApi(): String {
    delay(2000) // Simula latencia de red
    return "{ \"usuario\": \"Harry Potter\", \"casa\": \"Gryffindor\" }"
}
