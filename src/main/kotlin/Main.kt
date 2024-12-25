fun main() {
    // Ввод первого массива
    println("Введите первый массив чисел через пробел:")
    val array1 = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()

    // Ввод второго массива
    println("Введите второй массив чисел через пробел:")
    val array2 = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()

    if (array1.isEmpty() || array2.isEmpty()) {
        println("Ошибка: Один из массивов пуст или введен неверно.")
        return
    }

    // Вычисление пересечения массивов с учетом повторений
    val result = mutableListOf<Int>()
    val array2Copy = array2.toMutableList()

    for (num in array1) {
        if (array2Copy.contains(num)) {
            result.add(num)
            array2Copy.remove(num) // Удаляем число из второго массива, чтобы учесть повторения
        }
    }

    // Вывод результата
    println("Пересечение массивов: $result")
}
