/*Criar uma função de extensão da classe String com o
seguinte nome “lastName(): String” que irá retornar uma
String com o último nome de uma pessoa.*/

package org.example.exercicios

fun String.lastName(): String {
    return this.split(" ").last()
}

fun main() {
    val Name = "Julia Nunes"
    val Name2 = "Francisco Folli"
    val Name3 = "Gabriel Alves"

    println(Name.lastName())
    println(Name2.lastName())
    println(Name3.lastName())
}