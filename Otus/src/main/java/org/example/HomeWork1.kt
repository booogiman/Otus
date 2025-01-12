package org.example

    /*
    Описание/Пошаговая инструкция выполнения домашнего задания:
    Напишите обобщенную функцию transformCollection, которая принимает на вход коллекцию объектов и функцию для преобразования этих объектов.
    Функция должна применить заданное преобразование ко всем элементам коллекции и вернуть новую коллекцию с преобразованными объектами.
    К примеру, есть функция

    fun square(x: Int): Int {
        return x * x
    }

    fun main() {
        val numbers = listOf(1, 2, 3, 4, 5)
        val transformedNumbers = transformCollection(numbers, ::square)
        println(transformedNumbers) // вернется: [1, 4, 9, 16, 25]
    }*/



    private fun <T> transformCollection(input: List<T>, f:(List<T>) -> List<Int> ) {
        println("work")
        f(input)
    }

    private fun<T:Int> doubleSquare(x: List<T>): List<Int> {
        return x.map {
            println(it * it * 2)
            it * it * 2
        }
    }

    fun main() {
        transformCollection(
            listOf(1, 2, 3, 4, 5),
            ::doubleSquare)
    }


