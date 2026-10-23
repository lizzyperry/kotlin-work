// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        System.err.println("Error: please supply exactly three marks")
        exitProcess(1)
    }

    val marks = args.map { arg ->
        val mark = arg.toIntOrNull()
        if (mark == null || mark !in 0..100) {
            System.err.println("Error: '$arg' is not a valid mark (must be a whole number from 0 to 100)")
            exitProcess(1)
        }
        mark
    }
    val average = marks.average().roundToInt()

    val grade = when (average) {
        in 70..100 -> "Distinction"
        in 40..69 -> "Pass"
        else -> "Fail"
    }

    println("Average mark: $average")
    println("Grade: $grade")
}