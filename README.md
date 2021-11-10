# Kotlin Algorithms and Design Patterns

В этом репозитории приведены наиболее распространенные алгоритмы, структуры данных и паттерны проектирования, написанные на языке программирования Kotlin.

Весь код разбит по отдельным пакетам:

1. <code>sorting</code> - алгоритмы сортировки
2. <code>search</code> - алгоритмы поиска
3. <code>structures</code> - структуры данных (списки, массивы, стэк, очередь, бинарное дерево и др.)
4. <code>design-patterns</code> - паттерны проектирования
5. <code>other</code> - другие алгоритмы (расстояние Левенштейна, алгоритм Кнута Морриса Пратта и т.д.)

Для каждого файла с кодом сделаны тесты, которые находятся в директории <code>test/kotlin</code>

Также по возможности я добавляю *javadoc* для каждого класса, метода и файла

Структура:

1. пакет <code>design_patterns</code> - паттерны проектирования
    * [Builder](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/design_patterns/Builder.kt)
    * [Decorator](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/design_patterns/Decorator.kt)
    * [Facade](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/design_patterns/Facade.kt)
    * [Factory](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/design_patterns/Factory.kt)
    * [Fluent Interface](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/design_patterns/Fluent%20Interface%20Pattern.kt)
    * [Monostate](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/design_patterns/Monostate.kt)
    * [Singleton](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/design_patterns/Singleton.kt)
    * [Strategy](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/design_patterns/Strategy.kt)
    * [Observer](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/design_patterns/Observer.kt)
    * [Dependency Injection](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/design_patterns/Dependency%20%20Injection.kt)
    * [Adapter](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/design_patterns/Adapter.kt)

2. пакет <code>structures</code> - структуры данных
    * [Бинарное дерево](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/structures/BinaryTree.kt)
    * [Стэк](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/structures/Stack.kt)
    * [Очередь](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/structures/Queue.kt)
    * [Динамический массив](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/structures/DynamicArray.kt)
    * [Связанный список](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/structures/LinkedList.kt)

3. пакет <code>sorting</code> - алгоритмы сортировки
    * [Пузырьковая сортировка](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/sorting/BubbleSort.kt)
    * [Пузырьковая сортировка (улучшенная)](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/sorting/BubbleSortImproved.kt)
    * [Сортировка вставками](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/sorting/InsertionSort.kt)
    * [Сортировака слиянием](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/sorting/MergeSort.kt)
    * [Быстрая сортировка](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/sorting/QuickSort.kt)
    * [Сортировка выбором](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/sorting/SelectionSort.kt)
    * [Поразрядная сортировка](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/sorting/RadixSort.kt)

4. пакет <code>search</code> - алгоритмы поиска
    * [Бинарный поиск](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/search/BinarySearch.kt)
    * [Бинарный поиск (рекурсивный)](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/search/BinarySearchRecursive.kt)
    * [Линейный поиск](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/search/LinearSearch.kt)

5. пакет <code>other</code> - другие алгоритмы
    * [Факториал числа](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/other/Factorial.kt)
    * [Алгоритм Кнута Морриса Пратта для поиска подстроки](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/other/KnuthMorrisPratt.kt)
    * [Расстояние Левенштейна](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/other/LevensteinLength.kt)
    * [Палиндром](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/other/Palindrome.kt)
    * [Алгоритм Эвклида](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/other/Euclid.kt)
    * [FizzBuzz](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/other/FizzBuzz.kt)
    * [Алгоритм переворота массива](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/other/ReverseArray.kt)
    * [Решето Эратосфена](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/other/SieveOfEratosthenes.kt)
    * [Поиск минимума](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/other/Max.kt)
    * [Поиск максимума](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/other/Min.kt)
    * [Квадратный корень из числа](https://github.com/KiberneticWorm/Kotlin-Algorithms-and-Design-Patterns/blob/master/src/main/kotlin/other/Sqrt.kt)
