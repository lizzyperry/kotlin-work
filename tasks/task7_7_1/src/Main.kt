// Task 7.7.1: program to compute stats for a numeric dataset
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        System.err.println("Usage: <data file>")
        exitProcess(1)
    }
    val data = readData(args[0])
    if (data.isEmpty()) {
        System.err.println("Error: the file contains no values")
        exitProcess(1)
    }
    displayStats(data)
}