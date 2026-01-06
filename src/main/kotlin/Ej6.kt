package com.hogwarts

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Ej 6 notificaciones")
    
    val notificationJob = launch {
        while (isActive) {
            println("Notificacion recibida")
            delay(1500)
        }
    }

    //tiempo de actividad
    delay(5000)

    //cancelacion
    println("Usuario inactivo, parando notificaciones")
    notificationJob.cancelAndJoin()
    println("Sistema de notificaciones parado")
}
