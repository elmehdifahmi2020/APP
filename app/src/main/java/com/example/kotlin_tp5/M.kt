package com.example.kotlin_tp5

data class M(
    val intitule:String,
    val siRegional:Boolean,
    val termine:Boolean,
    var nbHeures:Int
)

fun main() {

    var modules : MutableList<Module> = mutableListOf(
        Module("j",true,true,90,3),
        Module("k",true,false,120,2),
        Module("E",false,false,80,4)
    )
    // 02
    println("02")
    modules.forEach {
        println("ModuleN $it")
        println("Module :${it.intitule}")
    }
    //03
    println("03")
    var intitules = modules.map { it.intitule }
    intitules.forEach {

        println("Module :${it}")
    }
//
//    //04
    println("04")
    var moduleRegionaux = modules.filter { it.siRegional == true }
    println(moduleRegionaux.map { it.intitule })

    var m = modules.groupBy { it.siRegional == true }
    println(m[true])
    println(m[false])


    //05
    println("05")

    var nbHeuresTot = modules.fold(0){nbtot,modus->nbtot + modus.nbHoures}

    //05
    println("05")
    var listHeur = modules.sortedBy { it.nbHoures}
    for (e in listHeur  )
        println(e)
    var listIntitule = modules.sortedBy { it.intitule }
    for (e in listIntitule  )
        println(e)


}