class Code {


    // 1.Higher Order Function: =>A function that accept another function as a parameter
    //OR
    //✔ return a function.
    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int) {
        val result = operation(a, b)
        println("Result = $result")
    }

    fun main() {

        calculate(10, 20) { x, y ->
            x + y
        }

    }

    // 2.Recursive Function: =>A function that calls itself repeatedly until a condition becomes false.
    fun factorial(num: Int): Int {

        return if (num == 1) {
            1
        } else {
            num * factorial(num - 1)
        }

    }

    // 3.Inline Function: =>Inline functions help improve performance in Kotlin
    inline fun message(action: () -> Unit) {

        println("Before calling lambda")

        action()

        println("After calling lambda")

    }

    fun main1() {

        message {
            println("Hello Kotlin")
        }

    }

    // 4.Suspend Function: =>Suspend functions are used in Kotlin Coroutines for asynchronous programming.
   // import kotlinx.coroutines.*
    suspend fun downloadData() {

        //delay(2000)
        println("Data Downloaded")

    }

    //fun main2() = runBlocking {

      //  downloadData()

    //}

    //💡 Interview Question
    //What is the difference between suspend Function and inline Function ?
}