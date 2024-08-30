/*
Criar uma função de extensão da classe Double com o
seguinte nome “toCurrencyFormat(): String” que irá
retornar uma String com um Double convertido em valor
monetário.
*/

package org.example.exercicios

import java.text.NumberFormat


fun Double.toCurrencyFormat(): String{
    val f = NumberFormat.getCurrencyInstance()
    return f.format(this)
}

fun main() {
    val valor: Double = 40.0
    println(valor.toCurrencyFormat())
}