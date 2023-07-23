package com.example.num

import java.util.*

fun main(args:Array<String>){
    var mood = readLine().toString()
    var weather= readLine().toString()
   if(!(mood).equals("")&&!(weather).equals("")){
    var outputFun=firstFun(mood,weather)
        secFun(outputFun)
    }else {
        firstFun()
        var outputFun=firstFun(mood,weather)
        secFun(outputFun)
    }
    val firstTry= Hello()
    val secondTry={ Hello()}
    //val firstTry store return of function
    //val secondTry store the whole function (lambda func) taking no parameters return (the return of func Hello() )
    print("\n"+firstTry+"\n"+secondTry)


}
fun firstFun(mood:String = "Happy", weather:String="Mild"):String{
    if(mood.equals("Happy")&&weather.equals("Sunny")) {
        print("Go to swimming\n")
    }else if(mood.equals("Happy")&&weather.equals("Rainy")) {
        print("Stay and watch your favorite film\n")
    }else if(mood.equals("Happy")&&weather.equals("Mild")) {
        print("Go to gym\n")
    }else if(mood.equals("Sad")&&weather.equals("Sunny")) {
        print("Go to club\n")
    }
    else if(mood.equals("Sad")&&weather.equals("Rainy")) {
        print("Play games on computer\n")
    }
      else if(mood.equals("Sad")&&weather.equals("Mild")){
        print("Call your friend and enjoy\n")
    }
    return weather;


}
fun secFun(output:String) {
if(output.equals("Sunny")) print("temperature from 35 to 50")
    else if(output.equals("Rainy")) print("temperature from 10 to 20")
    else{
    print("temperature from 20 to 35")
    }
}
fun Hello():String{
    return("Yes")
}