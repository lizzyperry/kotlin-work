// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {

    init {
        require(sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            "invalid triangle: $sideA, $sideB, $sideC"
        }
    }

    val perimeter: Double
        get() = (sideA + sideB + sideC)

    val semiPerimeter: Double
        get() = perimeter / 2.0

    val area: Double
        get() {
            val s = semiPerimeter
            return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
        }

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}
