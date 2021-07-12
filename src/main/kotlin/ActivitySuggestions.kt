fun main(args: Array<String>) {
    println(whatShouldIDoToday("windy"))
    println(whatShouldIDoToday("rainy", 0))
}

fun whatShouldIDoToday(weather: String = "sunny", temperature: Int = 24): String{
    print("How are you feeling today?: ")
    val mood = readLine()!!

    return when{
        sunnyAndHappy(mood, weather) -> "go for a walk"
        rainyAndSad(mood, weather) && temperature == 0 -> "stay in bed"
        snowyAndEnergetic(mood, weather, temperature) -> "play in the snow"
        windyAndHappy(mood, weather) -> "go hang-gliding"
        else -> "Stay home and read"
    }
}

fun sunnyAndHappy(mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun rainyAndSad(mood: String, weather: String) = mood == "sad" && weather == "rainy"

fun snowyAndEnergetic(mood: String, weather: String, temperature: Int) = mood == "energetic" && weather == "snowy" && temperature < 0

fun windyAndHappy(mood: String, weather: String) = mood == "happy" && weather =="windy"