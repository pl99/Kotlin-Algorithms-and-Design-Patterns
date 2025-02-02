package ru.design_patterns

/**
 * название: паттерн Decorator
 *
 * применение: используется для добавления дополнительной функциональности для нашего объекта
 *
 * описание: классы реализуют общий интерфейс и для расширения функицональности
 * предыдущего объекта, старый объекта передается через конструктор
 */

interface MyPrinter {
    fun printedText() : String
}

/**
 * возвращает Hello
 */
class HelloPrinter : MyPrinter {
    override fun printedText() : String {
        return "Hello"
    }
}

/**
 * добавляет к предыдущему значению функции printedText() запятую
 */
class CommaPrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() : String {
        return "${printer.printedText()},"
    }
}

/**
 * добавляет к предыдущему значению функции printedText() пробел
 */
class SpacePrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() : String {
        return "${printer.printedText()} "
    }
}

/**
 * добавляет к предыдущему значению функции printedText() слово World
 */
class WorldPrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() : String {
        return "${printer.printedText()}World"
    }
}

/**
 * добавляет к предыдущему значению функции printedText() восклицательный знак
 */
class ExclamationPrinter(private val printer: MyPrinter) : MyPrinter {
    override fun printedText() : String {
        return "${printer.printedText()}!"
    }
}