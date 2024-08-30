package org.example

fun main() {
    println(quadrado())
    nome()
    brithdayGreenting("Julia Nunes")
    println(imc(30.0, 1.56))
    ex13()
    ex14()
}
//exercicio 06

fun quadrado(): Int {
    var a = 5
    val aoQuadrado = a*a
    return aoQuadrado
}

//exercicio 07

fun nome (){
    val nome = "Julia Nunes"
    println("Quem é a guitarrista? ${nome}")
    brithdayGreenting("Julia Nunes")
}

//exercicio 10

fun brithdayGreenting(name: String): String{
    val nameGreenting = "Happy Brithday, $name!"
    val ageGreeting = "You are now 54 years old"
    return "$nameGreenting\n$ageGreeting"
}

//exercicio 12

fun imc(peso : Double, altura : Double): Double {
    var peso = peso
    var altura = altura
    var imc = peso/(altura*altura)
    return imc
}

//exercicio 13
fun ex13(){
    for (i in 1..3)
        println(i)
}

//exercicio 14
fun ex14() {
    var x = 5
    while (x > 0){
        x--
        println(x%2)
    }
}