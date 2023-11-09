package com.example.kotlin_tp5

class Module(
    var intitule:String,
    var siRegional:Boolean,
    var termine:Boolean,
    var nbHoures:Int,
    var moduleRegio:Int) {


}

fun main() {
    var models= mutableListOf<Module>()

    models.add(Module("M",true,true,10,9))
    models.add(Module("a",true,false,14,8))
    models.add(Module("b",false,false,19,2))


    models.forEach {
        println("{$it}")
        println("${it.intitule}")

    }

    var inn=models.map {it.intitule}
        println(inn)

    var moduleRegio = models.filter { it.siRegional == true }
    println(moduleRegio.map { it.intitule })

    var m = models.groupBy { it.siRegional == true }
    println(m[true])
    println(m[false])

}


