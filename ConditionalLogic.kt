fun main(args: Array<String>) {
    val a = 2
    val b = 2
    val c = 3
    if (a == b){
        println("A does in fact equal B")
    }
    if(a != c){
        println("A does not equal C")
    }

    val accountBalance = 100
    val price = 50
    if(accountBalance >= price){
        println("You can buy this.")
    }else{
        println("Sorry, you broke!")
    }

    val degrees = 50
    if(degrees >= 70){
        println("This is some nice weather")
    }else if(degrees < 70 && degrees >= 50){
        println("Grab asweater")
    }else{
        println("Holy crap! it's cold.")
    }

    val isHungry = false
    val isBored = true
    if(isHungry || isBored){
        println("Let's get pizza!")
    }


    val x = 3
    when(x){
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x != 1 && x != 2")
    }

    fun vaderIsFeeling(mood: String = "Angry"){
        if (mood == "Angry"){
            println("Run for the hills, Vader is $mood")
        }else{
            println("Whatever you do, don't make him angry!")
        }
    }
    vaderIsFeeling()
    vaderIsFeeling("Chillaxed")


}