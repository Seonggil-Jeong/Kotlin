package tasklist

import kotlinx.datetime.*

fun main() {
    val currentInstant = Clock.System.now()

    println(currentInstant)

    val instant1 = Instant.parse("2022-01-01T00:00:00Z")
    val instant2 = Instant.parse("2022-02-03T00:00:00Z")

// instant2 - instant1
    println(instant1.until(instant2, DateTimeUnit.WEEK, TimeZone.UTC))    // 4
    println(instant1.until(instant2, DateTimeUnit.DAY, TimeZone.UTC))     // 33
    println(instant1.until(instant2, DateTimeUnit.HOUR, TimeZone.UTC))    // 796
    println(instant1.until(instant2, DateTimeUnit.HOUR))                  // 796
    println(instant1.until(instant2, DateTimeUnit.SECOND, TimeZone.UTC))  // 2865906
    println(instant1.until(instant2, DateTimeUnit.SECOND))                // 2865906

// instant1 - instant2
    println(instant2.until(instant1, DateTimeUnit.WEEK, TimeZone.UTC))    // -4
}