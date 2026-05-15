

fun main(){

    // 1.Local Function: =>Function inside another function
    fun localFunction(){
        println("Local Function")
    }
    localFunction()


    val name = "Kotlin"
    println(name)

    varArgumentFunction(10)
    varArgumentFunction(10,20)
    varArgumentFunction(1,2,3,4,5,6,7,8,9,10)


    "Kotlin".extensionFunction()
    99.extensionFunction()
    lambdaFunction("Download source code from Github Repository")
}

// 2.Vararg Function: =>To pass one or more than one argument.
fun varArgumentFunction(vararg numbers: Int){
    var total = 0;
    for (num in numbers){
        total += num
    }
    println(total)

}

// 3.Extension Function: =>Add function to exiting class
fun String.extensionFunction(){
    println("Extension Function: $this")
}

fun Int.extensionFunction(){
    println("Extension Function with Integer Class:  $this")
}


// 4.Lambda Function: =>Anonymous function
val lambdaFunction = {name: String ->
    println("Lambda Function: $name")

}

//💡 Interview Question
//What is the difference between Lambda Function and Extension Function ?