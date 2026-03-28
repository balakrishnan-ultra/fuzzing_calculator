/*interface numericalvalue
{
    fun integer_data(val idv): Int
    {
        var i: Int = 0
        while(i < idv)
        {
            i++
        }
        return i
    }
}*/
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
    println("kotlin compiler fuzzer(kai) 2026 GSOC")
    //generate the integer value for user requirement
    print(int_data_generator(100))






    //var data_collect: List<Int> = listOf(c.integer_data(10))
    //println(data_collect)
    //println(c.integer_data(10))
}