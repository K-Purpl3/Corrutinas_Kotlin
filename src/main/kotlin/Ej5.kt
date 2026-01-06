package com.hogwarts

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Ej 5 Descargador de archivos")
    
    val job1 = launch { downloadFile("Archivo1.zip") }
    val job2 = launch { downloadFile("Archivo2.rar") }
    val job3 = launch { downloadFile("Archivo3.pdf") }
    
    joinAll(job1, job2, job3)
    
    println("Todas las descargas han finalizado")
}

suspend fun downloadFile(fileName: String) {
    println("Iniciando descarga de $fileName")
    for (i in 1..5) {
        delay(500)
        println("Descargando $fileName: ${i * 20}%")
    }
    println("$fileName descarga completado.")
}
