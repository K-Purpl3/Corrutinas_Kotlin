package com.hogwarts

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Ej 2 temporizador no bloqueante")
    
    val timerJob = launch {
        var seconds = 0
        while (true) {
            println("Tiempo transcurrido: $seconds segundos")
            delay(1000)
            seconds++
        }
    }
    //tiempo de ejecucion del temporizador
    delay(5500)

    //cancelacion del temporizador
    println("Cancelar temporizador")
    timerJob.cancelAndJoin()
    println("Temporizador stop")
}
