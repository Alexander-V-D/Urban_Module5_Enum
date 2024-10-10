open class MonthViewer {
    protected fun isStrokeMonth(stroke: String): Boolean {
        Months.entries.forEach {
            if (it.translatedName.lowercase() == stroke.lowercase()) return true
        }
        return false
    }
}