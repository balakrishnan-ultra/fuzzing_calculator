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
    val user_set_limit:Int = 15
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
            "+" -> println("f_n Data : $f_n\t" +"s_n Data : $s_n\t" +"output ->" + (f_n + s_n))
            "-" -> println("f_n Data : $f_n\t" +"s_n Data : $s_n\t" +"output ->" + (f_n - s_n))
            "*" -> println("f_n Data : $f_n\t" +"s_n Data : $s_n\t" +"output ->" + (f_n * s_n))
            "/" -> println("f_n Data : $f_n\t" +"s_n Data : $s_n\t" +"output ->" + (f_n / s_n))
            else -> println("Unknown symbole :(")
        }
        i++
    }
}
/*
---------------Simple calculator-------------------
f_n Data : 0	s_n Data : 0	output ->0
f_n Data : 1	s_n Data : 1	output ->2
f_n Data : 2	s_n Data : 2	output ->4
f_n Data : 3	s_n Data : 3	output ->6
f_n Data : 4	s_n Data : 4	output ->8
f_n Data : 5	s_n Data : 5	output ->10
f_n Data : 6	s_n Data : 6	output ->12
f_n Data : 7	s_n Data : 7	output ->14
f_n Data : 8	s_n Data : 8	output ->16
f_n Data : 9	s_n Data : 9	output ->18
f_n Data : 10	s_n Data : 10	output ->20
f_n Data : 11	s_n Data : 11	output ->22
f_n Data : 12	s_n Data : 12	output ->24
f_n Data : 13	s_n Data : 13	output ->26
f_n Data : 14	s_n Data : 14	output ->28
f_n Data : 15	s_n Data : 15	output ->30

Process finished with exit code 0
 */