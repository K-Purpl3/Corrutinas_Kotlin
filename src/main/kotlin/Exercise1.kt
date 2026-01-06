package com.hogwarts

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Inicio del simulador de tareas secuenciales ---")
    
    println("Iniciando login...")
    login()
    
    println("Cargando perfil...")
    loadProfile()
    
    println("Cargando preferencias...")
    loadPreferences()
    
    println("--- Proceso completado ---")
}

suspend fun login() {
    delay(1000)
    println("Login exitoso.")
}

suspend fun loadProfile() {
    delay(1000)
    println("Perfil cargado.")
}

suspend fun loadPreferences() {
    delay(1000)
    println("Preferencias cargadas.")
}
