fun main(args: Array<String>) {
    //immutable
    val imperials = listOf("Empreror","Darth Vader","Boba Fett","Tarkin")
    println(imperials)
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.first())
    println(imperials.last())
    println(imperials.indexOf("Tarkin"))
    println(imperials.lastIndexOf("Tarkin"))
    println(imperials.contains("Darth Vader"))

    //mutable
    val rebels = arrayListOf("Leiah","Luke","Han Solo", "Mon Mothma")
    println(rebels.size)

    rebels.add("Chewbacca")
    println(rebels)

    rebels.add(0,"Lando")
    println(rebels)
    println(rebels.indexOf("Lando"))

    rebels.remove("Han Solo")
    println(rebels)

    //immutable
    val rebelVehicleMap = mapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder")
    println(rebelVehicleMap)
    println(rebelVehicleMap["Solo"])
    println(rebelVehicleMap.get("Solo"))
    println(rebelVehicleMap.getOrDefault("Leiah","This ship doesn't exist!"))
    println(rebelVehicleMap.keys)
    println(rebelVehicleMap.values)


    //mutable
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "Xwing"
    println(rebelVehicles["Luke"])

    rebelVehicles.put("Leiah","Tantive IV")
    println(rebelVehicles)

    rebelVehicles.remove("Leiah")
    println(rebelVehicles)

//    rebelVehicles.clear()
//    rebelVehicles.isEmpty()

}