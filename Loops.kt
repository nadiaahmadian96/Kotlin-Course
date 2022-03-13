fun main(args: Array<String>) {
    val rebels = arrayListOf("Leiah","Luke","Han Solo", "Mon Mothma")
    for (rebel in rebels){
        println("Name: $rebel")
    }


    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    for((key,value) in rebelVehicles){
        println("$key gets around in their $value")
    }


    var x = 10
    while(x>0){
        println(x)
        x--
    }
}