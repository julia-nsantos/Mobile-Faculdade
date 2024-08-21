/*Crie um data class chamado “User” com atributos de “val
        id:Int” e “val name:String”.
Crie uma função chamada “ordenar” que receba por
parâmetro uma lista da classe “User” e retorne uma
outra lista com os elementos ordenados por nome em
ordem alfabética.*/

package org.example

data class User(val id:Int, val name:String)

fun ordenar(userList: List<User>): List<User> {
    return userList.sortedBy { it.name }
}

fun main() {

    val inputList = listOf(User(1, "Julia"), User(2, "Francisco"), User(3, "Gabriel"))
    val outputList = ordenar(inputList)
    
    outputList.forEach { 
        println(it.name) }
}

