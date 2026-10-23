// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean { //checks whether all three of the lentghs of the triangle can make a triangle cuz each side has to be shorter than the sum of the other two cuz triangles
    val (a, b, c) = triangle
    return a < b + c && b < a + c && c < a + b
}
fun triangleArea(triangle: Triangle): Double { //uses the heron formula to return the area
    require(isValidTriangle(triangle)) { "Invalid triangle: $triangle" } //the edit
    val (a, b, c) = triangle
    val s = (a + b + c) / 2.0
    return sqrt(s * (s - a) * (s - b) * (s - c))
}