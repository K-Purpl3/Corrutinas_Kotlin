package com.hogwarts

import kotlinx.coroutines.*

// 7️⃣ Gestor de tareas con cancelación
fun main() = runBlocking {
    println("--- Inicio de gestor de tareas con cancelación ---")
    
    val longRunningTask = launch {
        try {
            repeat(100) { i ->
                println("Procesando tarea parte $i...")
                delay(500)
            }
        } finally {
            withContext(NonCancellable) {
                println("Limpiando recursos antes de terminar...")
                delay(1000) // Simular operación de limpieza
                println("Recursos liberados.")
            }
        }
    }
    
    delay(2500)
    println("Cancelando tarea larga...")
    longRunningTask.cancelAndJoin()
    println("Tarea cancelada correctamente.")
}
