/*Criar uma função de extensão da classe String com o
seguinte nome “firstName(): String” que irá retornar uma
String com o primeiro nome de uma pessoa.*/

package org.example


fun String.firstName(): String {
    return this.split(" ").first()
}

fun main() {
    val Name = "Julia Nunes"
    val Name2 = "Francisco Folli"
    val Name3 = "Gabriel Alves"

    println(Name.firstName())
    println(Name2.firstName())
    println(Name3.firstName())

}