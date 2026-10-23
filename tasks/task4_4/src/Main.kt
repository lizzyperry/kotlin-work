// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        System.err.println("Usage: <initial °C> <maximum °C> <increment>")
        exitProcess(1)
    }

    val numbers = args.map { it.toDoubleOrNull() }
    if (numbers.any { it == null }) {
        System.err.println("Error: all three arguments must be numbers")
        exitProcess(1)
    }
    val (initial, maximum, increment) = numbers.map { it!! }
    if (increment <= 0.0) {
        System.err.println("Error: increment must be greater than zero")
        exitProcess(1)
    }
    println("%8s %8s".format("°C", "°F"))
    var celsius = initial
    while (celsius <= maximum) {
        val fahrenheit = celsius * 9.0 / 5.0 + 32.0
        println("%8.1f %8.1f".format(celsius, fahrenheit))
        celsius += increment
    }
}
