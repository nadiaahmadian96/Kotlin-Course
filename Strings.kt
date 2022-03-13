import java.util.*

fun main(args: Array<String>) {
    val str = "May the force be with you."
    println(str)

    val str1 = "Eminem once said: \"hush little baby don't you cry\n" +
            "Everything's gonna be alright\n" +
            "Stiffen that upper lip up little lady\n" +
            "I told ya, daddy's here to hold ya\n" +
            "Through the night\""
    println(str1)

    val rawCrawl = """|A long time ago,
        |in a galaxy
        |far, far, away...
        |BUMM BUMM BUMMMM""".trimMargin()
    println(rawCrawl)

    for(char in str){
         println(char)
    }

    //comparing two strings
    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    val contains = str.contains("Force", true)
    println(contains)

    val upperCase = str.uppercase(Locale.getDefault())
    println(upperCase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)


    val subSequence = str.subSequence(4,13)
    println(subSequence)


    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landSpeeder"
    val age = 27
    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old!")
    println("Luke's full name \"$luke\" has ${luke.length} characters.")
}