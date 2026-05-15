


fun main(){


    //println("Hello Developers")
    greet()
    greetUser("Developers")

   val result = add(20,30)
    println(result)


}

//1. Basic Function
fun greet() {
    println("Hello, Welcome to Kotlin!")
}

//2. Function with Parameters
fun greetUser(name: String) {
    println("Hello $name")
}

//3. Function with Return Type
fun add(a: Int, b: Int): Int {
    return a + b
}


//4. Interview Question
// What is the difference between a function with return type and without return type?