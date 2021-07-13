import java.util.*

fun main(args: Array<String>) {
    val rollDice = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
    println("The Dice Roll for Lambda Version is: ${rollDice(50)}")

    fun rollDice2(sides: Int): Int = if(sides == 0) 0 else Random().nextInt(sides) + 1

    println("The Dice Roll for Function Version is: ${rollDice2(50)}")
}
