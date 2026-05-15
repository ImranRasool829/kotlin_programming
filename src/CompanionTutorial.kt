
fun main(){


    //println(CompanionTutorial.message)

    //println(CompanionTutorial.greet())
 println(CompanionTutorial.sum())

}

class CompanionTutorial {

    companion object{

        val message = "Hello Developers, Welcome to Kotlin Programming Language"

        fun greet(){
            println(message)
        }

        fun sum(): Int{
            return 10+20
        }

    }

}