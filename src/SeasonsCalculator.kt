class SeasonsCalculator: MonthViewer() {

    fun getSeasonTranslatedNameByMonth(month: String): String? {
        if (isStrokeMonth(month)) {
            var ordinal = 0
            Months.entries.forEach {
                if (it.translatedName.lowercase() == month.lowercase()) ordinal = it.ordinal
            }
            return when (ordinal) {
                in 1..2 -> Seasons.WINTER.translatedName
                in 3..5 -> Seasons.SPRING.translatedName
                in 6..8 -> Seasons.SUMMER.translatedName
                in 9..11 -> Seasons.AUTUMN.translatedName
                else -> Seasons.WINTER.translatedName
            }
        }
        return null
    }
}