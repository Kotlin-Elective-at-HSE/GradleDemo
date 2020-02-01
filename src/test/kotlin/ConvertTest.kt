import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ConvertTest {

    @Test
    fun binary() {
        val actual = convert("1000", 2)
        val expected = 8
        assertEquals(expected, actual, "conversion from binary give a right answer")
    }

    @Test
    fun unary() {
        val actual = convert("1111", 1)
        val expected = 4
        assertEquals(expected, actual, "conversion from unary should give a right answer")
    }

    @Test
    fun failing() {
        assertFailsWith<IllegalArgumentException>("conversion from negative should fail") {
            convert("1234", -1)
        }
    }
}
