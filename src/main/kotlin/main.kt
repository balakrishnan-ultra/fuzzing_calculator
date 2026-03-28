//Integer Fuzzing data Generator function
// signed. write the code in comming day
fun byte_data_generator(){}
fun short_data_generator(){}
fun long_data_generator(){}
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


//integer data generator function
// unsigned. write the code in future




fun main()
{
    //variable assignment for testing most used function
    var f_n:Int = 0
    var s_n:Int = 0
    val symbole_user: String ="+"
    val user_set_limit:Int = 5673
    var fuzz_test_int = int_data_generator(user_set_limit)
    var i =0

    //generate the integer value for user requirement
    //print(int_data_generator(100))



    println("---------------Simple calculator-------------------")
    //This is user used app process
    /*println("Enter First Number : ")
    val f_n = readln().toInt()
    println("Enter the Symbole :")
    val symbole_user = readLine()
    println("Enter second Number :")
    val s_n = readln().toInt()*/

    //fuzzing testing loop
    while(i <= user_set_limit)
    {
        f_n = fuzz_test_int[i]
        s_n = fuzz_test_int[i]

        //Application most used function
        when (symbole_user)
        {
            "+" -> println(f_n + s_n)
            "-" -> println(f_n - s_n)
            "*" -> println(f_n * s_n)
            "/" -> println(f_n / s_n)
            else -> println("Unknown symbole :(")
        }
        i++
    }
}