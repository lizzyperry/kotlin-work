// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "single value when size=1" { //for single size and
        median(listOf(4.2f)) shouldBe (4.2f plusOrMinus tolerance)
    }

    "mean of both values when size=2" {
        median(listOf(5.0f, 1.0f)) shouldBe (3.0f plusOrMinus tolerance)
    }

    "middle value after sorting when size=3" {
        median(listOf(9.0f,1.0f,2.0f)) shouldBe (2.0f plusOrMinus tolerance)
    }

    "mean of middle two values are sorting whem size=4" {
        median(listOf(10.0f, 1.0f, 4.0f, 2.0f)) shouldBe (3.0f plusOrMinus tolerance)
    }

})
