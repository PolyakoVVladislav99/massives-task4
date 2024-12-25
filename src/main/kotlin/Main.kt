fun main() {
    
    println("Введите первый массив чисел через пробел:")
    val array1 = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()

    println("Введите второй массив чисел через пробел:")
    val array2 = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()

    if (array1.isEmpty() || array2.isEmpty()) {
        println("Ошибка: Один из массивов пуст или введен неверно.")
        return
    }

    val result = mutableListOf<Int>()
    val array2Copy = array2.toMutableList()

    for (num in array1) {
        if (array2Copy.contains(num)) {
            result.add(num)
            array2Copy.remove(num) 
        }
    }

    println("Пересечение массивов: $result")
}
