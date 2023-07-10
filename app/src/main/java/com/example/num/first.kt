package com.example.num

import kotlin.math.min

fun main(args:Array<String>){
    val firstNum=readln().toInt();
    val secondNum= readln().toInt();
    val minimum=minOf((firstNum),(secondNum));
    val maximum=maxOf((firstNum),(secondNum));
    for ( i in minimum..maximum){
        if (i%7==0) print("$i ");
    }

}