package com.mx.coroutinefundamentals


/**
 * Tenemos nuestra funcion main, en la cual llamamos a la funcion lambda
 */
fun main () {
    lambda()
}

/**
 * En nuestra funcion lambda llamamos a println en donde pasamos la funcion multi y como parametros dos enteros
 */
fun lambda() {
println(multi(2,3))
}

/**
 * En nuestra función multi recibimos los parametros de tipo Int retornando una operación
 * la cual se imprimira al llamar desde main a la función lambda
 */
fun multi(x: Int, y: Int): Int? {
return x * y
}
