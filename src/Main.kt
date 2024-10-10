fun main() {

    //Задача 1
    while (true) {
        println("Введите месяц года:")
        val input = readln()
        val season = SeasonsCalculator().getSeasonTranslatedNameByMonth(input)
        if (season == null) println("Такого месяца нет") else println(season)
        println("1. Продолжить; 2. Закончить программу")
        if (readln() == "2") break
    }

    //Задача 2
    val stroke = "Шумоизоляция"
    var repeated = arrayOf<Char>()
    val charArray = stroke.toCharArray()
    for (i in charArray.indices) {
        for (j in charArray.indices) {
            if (i != j &&
                charArray[i].lowercase() == charArray[j].lowercase() &&
                !repeated.contains(charArray[j])
            ) repeated += charArray[i]
        }
    }
    println("Ответ к задаче 2: ${repeated.size}")
}