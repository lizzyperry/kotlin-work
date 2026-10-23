// Task 7.7.1: statistics functions
fun median(values: List<Float>): Float {
    require(values.isNotEmpty()) { "Cannot compute the median of an empty list" }
    val sorted = values.sorted()
    val middle = sorted.size / 2
    return if (sorted.size % 2 == 1) {
        sorted[middle]
    } else {
        (sorted[middle - 1] + sorted[middle]) / 2
    }
}

fun displayStats(values: List<Float>) {
    println("Minimum: ${values.min()}")
    println("Maximum: ${values.max()}")
    println("Mean:    ${values.average()}")
    println("Median:  ${median(values)}")
}