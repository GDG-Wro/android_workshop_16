package pl.gdg.myapplication

import io.kotest.matchers.collections.shouldBeSortedWith
import io.kotest.matchers.collections.shouldNotContain
import io.kotest.matchers.ints.shouldBeExactly
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `addition is correct`() {
        2 + 2 shouldBeExactly 4
    }

    @Test
    fun `list contains odd numbers`() {
        listOf(1, 3, 5) shouldNotContain 7
        listOf(1, 3, 5) shouldBeSortedWith Int::compareTo
    }
}
