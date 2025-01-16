@file:Suppress("NAME_SHADOWING")

package org.example.HW2

fun main() {
    val person = listOf(
        Person("Петя", 25),
        Person("Вася", 30),
        Person("Даша", 25),
        Person("Женя", 30),
        Person("Алексей", 20),
    )
    val results = person.groupBy { person ->
        person.age
    }

    for (result in results) {
        println("В возрастной группе ${result.key} -  ${result.value.size} человек")
    }

    val words = listOf(
        "Альбатрос",
        "квадрат",
        "дерево",
        "круг",
        "земля",
        "Альтернатива",
        "бандаж",
        "Аэропорт",
        "Эльбрус",
        "Аура"
    )

    val resultWords = words
        .filter { words -> words.startsWith('А') }
        .groupBy { words -> words.length }

    for (result in resultWords) {
        println(result)
    }
}