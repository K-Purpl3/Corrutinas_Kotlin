package com.hogwarts

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Ej1 Tareas secuenciales")
    //llama de manera secuencial a los metodos suspend fun
    println("Login")
    login()
    
    println("Cargar perfil")
    loadProfile()
    
    println("Cargar preferencias")
    loadPreferences()
    
    println("Proceso completado")
}

suspend fun login() {
    delay(1000)
    println("Login exitoso")
}

suspend fun loadProfile() {
    //carga datos
    delay(1000)
    println("Perfil cargado")
}

suspend fun loadPreferences() {
    //lectura de preferencias
    delay(1000)
    println("Preferencias cargadas")
}
