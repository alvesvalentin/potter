private const val FIVE_PERCENT_DISCOUNT = 0.95

private const val TEN_PERCENT_DISCOUNT = 0.90

class Potter(private val books: List<String>) {

    fun calculateAmountToPay(): Double {
        val distinct = books.distinct()

        if (books.size != distinct.size) {
            return (8 * books.count()).toDouble()
        }

        if (books.size == 2) return (8 * 2) * FIVE_PERCENT_DISCOUNT

        if (books.size == 3) return (8 * 3) * TEN_PERCENT_DISCOUNT

        if (books.size == 4) return (8 * 4) * 0.80

        return 8.0
    }
}