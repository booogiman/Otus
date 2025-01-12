package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        transformCollection(
                listOf(1, 2, 3, 4, 5),
                ::doubleSquare)


    }

    private fun <T> transformCollection(input: List<T>, f:(List<T>) -> List<Int> ) {
        println("work")
        f(input)
    }

    private fun<T:Int> doubleSquare(x: List<T>): List<Int> {
        return x.map { it * it * 2 }
    }
}