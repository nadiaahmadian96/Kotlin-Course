fun main(args: Array<String>) {
    //var is used for mutable variables and val is used for immutable ones
    //Kotlin supports time inference
    val name = "Jinx"
    var isAwesome = true
    println("Is "+name+" awesome? The answer is "+isAwesome)

    var a = 3
    var b = 2
    println(a+b)


    val doubleNum = 123.45 //64 bits number
    val floatNum = 123.45f //32 bits number
    val longNum = 1234567890123345L //64 bits number

    //type conversion
     val aDouble = a.toDouble()

    //initialising a variable without setting a value for it
    var hero : String
    hero= "Silco"


}