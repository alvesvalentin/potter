import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PotterTest {

    @Test
    fun `buying one book costs 8 euro`() {
        // Arrange
        val books = listOf("Harry Potter Book One")
        val potter = Potter(books)

        // Act
        val amountToPay = potter.calculateAmountToPay()

        // Assert
        assertThat(amountToPay).isEqualTo(8.0)
    }
    
    @Test
    fun `buying two different books gets us a 5 percent discount` () {
        // Arrange
        val books = listOf("Harry Potter Book One", "Harry Potter Book Two")
        val potter = Potter(books)

        // Act
        val amountToPay = potter.calculateAmountToPay()

        // Assert
        assertThat(amountToPay).isEqualTo(15.20)
    }

    @Test
    fun `buying three different books gets us a 10 percent discount` () {
        // Arrange
        val books = listOf("Harry Potter Book One", "Harry Potter Book Two", "Harry Potter Book Three")
        val potter = Potter(books)

        // Act
        val amountToPay = potter.calculateAmountToPay()

        // Assert
        assertThat(amountToPay).isEqualTo(21.60)
    }

    @Test
    fun `buying four different books gets us a 20 percent discount` () {
        // Arrange
        val books = listOf("Harry Potter Book One", "Harry Potter Book Two", "Harry Potter Book Three", "Harry Potter Book Four")
        val potter = Potter(books)

        // Act
        val amountToPay = potter.calculateAmountToPay()

        // Assert
        assertThat(amountToPay).isEqualTo(25.60)
    }

    @Test
    fun `buying same books twice don't get us any discount` () {
        // Arrange
        val books = listOf("Harry Potter Book One", "Harry Potter Book One")
        val potter = Potter(books)

        // Act
        val amountToPay = potter.calculateAmountToPay()

        // Assert
        assertThat(amountToPay).isEqualTo(16.0)
    }

    @Test
    fun `buying two identical sets gives us 5 percent on each set` () {
        // Arrange
        val books = listOf("Harry Potter Book One", "Harry Potter Book One", "Harry Potter Book Two", "Harry Potter Book Two")
        val potter = Potter(books)

        // Act
        val amountToPay = potter.calculateAmountToPay()

        // Assert
        assertThat(amountToPay).isEqualTo(30.40)
    }


}