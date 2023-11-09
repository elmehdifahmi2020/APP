package com.example.kotlin_tp5

fun main() {
    var list= mutableListOf<Int>(5,8,9)
    list.add(30)

    var lista:List<Int> =list
    println(lista)

    var listPaire = lista.filter { it %2==0 }
    println(listPaire)

    var listeName= listOf("abde",null,"mehdu",null,"abcmed","bca")
    var notnull=listeName.take(3)
        .filterNotNull()
        .filter { it.length>3 }
        .any { it.lowercase().contains("m") }
    println(notnull)
    var filternot=listeName
        .filterNotNull()
        .filterNot { it == "mehdu"}
        .map { it.uppercase() }
        .sorted()
    println(filternot)



}