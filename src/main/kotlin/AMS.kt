fun main(args: Array<String>){
    println(fitMoreFish(10.0, listOf(3,3,3)).toString())
    println(fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false).toString())
    println(fitMoreFish(9.0, listOf(1,1,3), 3).toString())
    println(fitMoreFish(10.0, listOf(), 7, true).toString())

}

fun fitMoreFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) : Boolean{
    if(hasDecorations){
        val tankSizeWithDecorations = (tankSize * .80)
        if(getTotalFishSize(currentFish) + fishSize <= tankSizeWithDecorations) return true
        return false
    }
    if(getTotalFishSize(currentFish) + fishSize <= tankSize) return true
    return false
}

fun getTotalFishSize(currentFish: List<Int>): Int{
    var totalFishSize: Int = 0
    for(fish in currentFish){
        totalFishSize += fish
    }

    return totalFishSize
}








/*
fun main(args: Array<String>) {
    println("Good ${if((args[0].toInt()) < 12) "Morning" else "Night"} Kotlin")
    for(i in 0..10){
        val fortune : String = getFortuneCookie()
        println("Your Fortune is: $fortune")
        println(i.toString())
        if(fortune == "Man who drops watch in toilet is bound to have shitty time") break
    }
}

fun getFortuneCookie () : String{
    val fortunes : List<String> = listOf("Man who drops watch in toilet is bound to have shitty time",
        "The love of your life is stepping into your planet this summer",
        "Land is always on the mind of a flying bird",
        "Fortune favors the brave",
        "You already know the answer to the questions lingering inside your head")

    val birthdayRemainder : Int = getBirthday(fortunes.count())

    return fortunes[birthdayRemainder]
}

fun getBirthday(amountOfFortunes : Int) : Int{
    print("Enter your Birthday: ")
    val birthday : Int = readLine()?.toIntOrNull() ?:1

    //check for specific birthdays
    when(birthday){
        in 1..7 -> return 0
        12 -> return 3
        25 -> return 4
    }

    //else return fortune based on remainder of birthday divided by amount of fortunes
    val birthdayRemainder : Int = birthday % amountOfFortunes

    println(birthdayRemainder)

    return birthdayRemainder
}
 */