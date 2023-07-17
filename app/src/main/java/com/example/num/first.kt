package com.example.num

    fun main(args:Array<String>){
        var numbers:Int;
        println("Please Enter how many numbers you want?");
        val size= readln().toInt();
        for (i in 1..size ){
            numbers= readln().toInt();
            if (numbers%7==0)
            println(numbers);
        }

    }


