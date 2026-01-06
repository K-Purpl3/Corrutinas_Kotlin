package com.hogwarts

import kotlinx.coroutines.*

// 2️⃣ Temporizador no bloqueante
fun main() = runBlocking {
    println("--- Inicio del temporizador no bloqueante ---")
    
    val timerJob = launch {
        var seconds = 0
        while (true) {
            println("Tiempo transcurrido: $seconds segundos")
            delay(1000)
            seconds++
        }
    }
    
    // Dejamos que el temporizador corra por 5 segundos
    delay(5500)
    
    println("Cancelando temporizador...")
    timerJob.cancelAndJoin()
    println("Temporizador detenido.")
}
