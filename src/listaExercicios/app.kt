package listaExercicios

import java.time.LocalDateTime

/**
 * Created by josemauricio on 20/02/18.
 */

fun main(args: Array<String>) {


    trocarValores(1, 2)


}

// Questão 1
// 1)
fun calculo1(a: Int, b: Int, c: Int, d: Int) :Int{
    return a + b + c + d / 4
}

// 2)
fun calculo2(b: Int, e: Int) :Int{
    return b/e
}

// 3)
fun calculo3(c: Int, d: Int) :Boolean{
    return !(c > d)
}

// 4)
fun calculo4(d: Int, b: Int) :Int{
    return d / b
}

// 5
fun calculo5(a: Int, b: Int, c: Int) :Boolean{
    return a > b || b < c
}

// 6
fun calculo6(b: Int, d: Int) :Int{
    return 2 * b - d / 2
}

// 7
fun calculo7(d: Int, b: Int) : Boolean{
    return d % b == 0
}

// 8
fun calculo8(a: Int, b: Int, c: Int, d: Int) :Boolean{
    return  a > b || b < c && (b > c || c < d)
}

// 9
fun calculo9(b: Int, c: Int, d: Int) :Boolean{
    return b > c || ! (2 * c != d)
}

// 10
fun calculo10(a: Int, b: Int, c: Int, d: Int) :String{
    return "${a} + ${b} + ${c}" + d
}

// Questao 2
fun colhendoDados(){
    println("Informe seu nome:")
    val name = readLine()
    println("Informe sua idade:")
    val idade = readLine()?.toInt()
    println("Informe sua altura:")
    val altura = readLine()?.toDouble()
    println("Você é casado:")
    val casado = readLine()?.toBoolean()


    println("${name?.substring(0, 1)}: $name")
    println("Idade: $idade")
    println("Altura: $altura")
    println("Casado: $casado")
}

// Questao 3
fun trocarValores(num1: Int, num2: Int){
    var temp = num1
    var num1 = num2
    var num2 = temp

    println("num1 = $num1")
    println("num2 = $num2")
}

// Questao 4
fun anoDeNasciemnto(ano: Int){
    val idadeHoje = LocalDateTime.now().year - ano

    val idade2020 = 2020 - ano

    println("Hoje tenho ${idadeHoje} anos, já em 2020 terei ${idade2020}")
}

// Questao 5
fun tempFahrenheit(celsius: Int){

    val fahrenheit = ((9 * celsius)/5) + 32

    println("${celsius} celsius em Fahrenheit é ${fahrenheit}")
}





