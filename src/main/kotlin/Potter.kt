private const val FIVE_PERCENT_DISCOUNT = 0.95

class Potter(private val books: List<String>) {

    fun calculateAmountToPay(): Double {
        val distinct = books.distinct()

        if (books.size != distinct.size) {
            return (8 * books.count()).toDouble()
        }


        if (books.size == 2) {
            return (8 * 2) * FIVE_PERCENT_DISCOUNT
        } else return 8.0
    }
}