


fun main(){


    greeting()
    greeting()
    greeting()

    greetUserDetail(", Welcome in the world of Kotlin programming language")
    greetUserDetail()

    userInformation("kotlin","kotlin@gmail.com",32)

    println(calculateDiscount1(10.99))

}


//1. function with Unit Return type
fun greeting(): Unit{
    println("Hello Developers")
}


// 2.Default Parameters Function
fun greetUserDetail(name: String = "Guest") {
    println("Hello $name")
}

// 3.Named Arguments Function
fun userInformation(name: String, email: String, age: Int) {
    println("Name: $name,Email: $email Age: $age")
}


// 4.Single Expression Function
fun calculateDiscount1(price: Double) = price * 1.99

//💡 Interview Question
//What is the difference between Unit and Void ?