import jdk.dynalink.Operation
import kotlin.math.acos
import kotlinx.coroutines.*


fun main(){

    // 1.Higher Order Function
    // 2.Recursive Function
    // 3.Inline Function
    // 4.Suspend Function:


    calculateHigherOrderFunction(10,20)
    {x,y ->
        x+y;

    }


}

// 1.Higher Order Function:
//A function that accept another function as a parameter OR return a function.
fun calculateHigherOrderFunction(a:Int,b:Int,operation:(Int,Int)->Int){

  val result =  operation(a,b)
    println(result)

}















/*
// 1.Higher Order Function:
//A function that accept another function as a parameter OR return a function.
fun calculateHigherOderFunction(a: Int,b: Int,operation:(Int, Int) -> Int){

   val result = operation(a,b)
    println(result)

}


// 2.Recursive Function:
// A function that calls itself repeatedly until a condition becomes false.
fun factorialRecursiveFunction(num: Int): Int{

    return if (num ==1){
        1
    }else {

        num * factorialRecursiveFunction(num - 1)
    }


}

// 3.Inline Function:
//Inline functions help improve performance in Kotlin
inline fun inlineFunction(action:() -> Unit){

    println("Before Lambda Function")
    action()

    println("After Lambda Function")

}


// 4.Suspend Function:
// Suspend functions are used in Kotlin Coroutines for asynchronous programming.
suspend fun suspendFunction(){

    delay(10000)
    println("Hello Kotlin Suspend Function")
}
*/

//💡 Interview Question
//What is the difference between suspend Function and inline Function ?