import java.util.Scanner
import kotlin.math.ln

fun main(){
    println("enter the size ")
    val n  =Scanner(System.`in`).nextInt()
    var counter =0
    val my_list=ArrayList<String>()
    while (counter < n)
    {
        println("enter the input ")
        val input=Scanner(System.`in`).nextLine()
        my_list.add(input)
        counter++
    }


    for (item in my_list)
    {
      if(item.contains('b',true)|| item.contains('m',true)){
          println(item.uppercase())
      }
    }


}




