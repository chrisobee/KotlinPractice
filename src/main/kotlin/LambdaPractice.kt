import java.util.*

fun main(args: Array<String>) {
    println("The Dice Roll for Lambda Version is: ${rollDice(50)}")

    println("The Dice Roll for Function Version is: ${rollDice2(50)}")

    gamePlay(rollDice(20))
    gamePlay(rollDice(20))
}

val rollDice = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

val rollDice2: (Int) -> Int = { sides -> if(sides == 0) 0 else Random().nextInt(sides) + 1 }

fun gamePlay(diceRoll: Int){
    println("The roll of the dice results in: $diceRoll")
}
