


fun main(){

    //1. What is null ? -> null means no value or empty value.

    val name = null
    println(name)

    //val productName: String = null


    //2. How Kotlin handles null safety

    val productName: String? = null
    println(productName)

    //3.  Safe call Operator ?.

    val safeCall: String? = null
    val len = safeCall?.length

    println(len)


    //4. Elvis operator ?: -> if we want a default value of variable when its null

   val name1: String? = null
    val len1 = name1?.length ?:10
    println(len1)


    //5. Not-null assertion !!  ->when we are 100% sure, this value is not null

    val companyName: String? = "Kotlin"
    println(companyName!!.length)







    //Interview Question
    //What is the difference between ?. (safe call) and !! (not-null assertion) in Kotlin?

}
