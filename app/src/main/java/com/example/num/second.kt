package com.example.num

fun main(args:Array<String>){
   var numbers:Int;
   println("Please Enter how many numbers you want?");
   val size= readln().toInt();
   for (i in 1..size ){
    numbers= readln().toInt();
    if (numbers%3==0){
       if (numbers%5==0){
          break;
       }
       continue;
    }
      println(numbers);
   }

}