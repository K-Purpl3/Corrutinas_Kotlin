package com.hogwarts

import kotlinx.coroutines.*

// 6️⃣ Sistema de notificaciones
fun main() = runBlocking {
    println("--- Inicio de sistema de notificaciones ---")
    
    val notificationJob = launch {
        while (isActive) {
            println("🔔 Nueva notificación recibida")
            delay(1500)
        }
    }
    
    // Simular actividad del usuario
    delay(5000)
    
    println("Usuario inactivo. Deteniendo notificaciones...")
    notificationJob.cancelAndJoin()
    println("Sistema de notificaciones detenido.")
}
