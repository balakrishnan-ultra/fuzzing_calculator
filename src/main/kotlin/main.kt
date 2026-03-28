//Integer data Generator function
// signed
fun byte_data_generator(){}
fun short_data_generator(){}
fun int_data_generator(user_set_limit:Int):MutableList<Int>
{
    var generator_value_list = mutableListOf<Int>()
    var generator_value: Int = 0
    while(generator_value <= user_set_limit)
    {
        generator_value_list.add(generator_value)
        generator_value++
    }
    return generator_value_list

}
fun long_data_generator(){}


//integer data generator function
// unsigned

fun main()
{
    //variable assignment
    var f_n:Int = 0
    var s_n:Int = 0
    val symbole_user: String ="+"
    println("kotlin compiler fuzzer(kai) 2026 GSOC")
    //generate the integer value for user requirement
    //print(int_data_generator(100))
    var fuzz_test_int = int_data_generator(578)
    for(i in fuzz_test_int)
    {
        f_n = i
        println(f_n)
        s_n = i
    }


    println("---------------Simple calculator-------------------")
    //This is user requirement and user use the app
    /*println("Enter First Number : ")
    val f_n = readln().toInt()
    println("Enter the Symbole :")
    val symbole_user = readLine()
    println("Enter second Number :")
    val s_n = readln().toInt()*/
    when(symbole_user)
    {
        "+" -> println(f_n + s_n)
        "-"-> println(f_n - s_n)
        "*" -> println(f_n * s_n)
        "/" -> println(f_n / s_n)
        else -> println("Unknown symbole :(")
    }
}