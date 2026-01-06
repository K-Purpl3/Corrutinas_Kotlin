package com.hogwarts

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Ej 7 gestor de tareas con cancelacion")

    //lanzamiento de tarea prolongada
    val longRunningTask = launch {
        try {
            repeat(100) { i ->
                println("Procesando tarea parte $i")
                delay(500)
            }
        } finally {
            //limpieza despues de canclar
            withContext(NonCancellable) {
                println("Liberando recursos")
                delay(1000)
                println("Recursos liberados")
            }
        }
    }

    //tiempo antes de cancelar
    delay(2500)
    println("Cancelando tarea larga")
    longRunningTask.cancelAndJoin()
    println("Tarea cancelada correctamente")
}
