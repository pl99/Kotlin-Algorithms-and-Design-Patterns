package en.design_patterns

/**
 * name: Factory
 *
 * using: used to create many similar objects without directly calling the constructor
 */

abstract class Screen {
    abstract  fun size() : Pair<Float, Float>
}

class LargeScreen : Screen() {
    override fun size(): Pair<Float, Float> {
        return 1920f to 1080f
    }
}

class SmallScreen : Screen() {
    override fun size(): Pair<Float, Float> {
        return 1280f to 720f
    }
}

enum class Screens {
    FULL_HD, HD
}

class ScreenFactory {
    fun screenBy(type: Screens) = when (type) {
        Screens.FULL_HD -> LargeScreen()
        Screens.HD -> SmallScreen()
    }
}