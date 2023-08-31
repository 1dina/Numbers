package com.example.num

fun main(args:Array<String>) {
    val Name = mutableSetOf("Mahmoud", "Mohammed", "Suzan", "Alaa", "Zeinab")
    val College = mutableSetOf("CIS", "Science", "pharmacy", "Medicine", "Engineering")
    val Age = mutableSetOf(20, 25, 18, 23, 27)
    val Game = mutableSetOf("Football", "Basketball", "volleyball", "Karate", "Chess")
    println(Name)
    println(College)
    println(Age)
    println(Game)
    var i =0
    println("Please enter a name:")
    var variable = readLine()
    while(variable!="FINISH"){
  if(i==1) {
      College.add(variable.toString())
            i++
      println("Please enter an age:")
            variable = readLine()
    }
        else if(i==2) {
            Age.add(variable.toString().toInt())
            i++
      println("Please enter a game:")
            variable = readLine()
        }
        else if(i==3) {
            Game.add(variable.toString())
            i++
      println("Please enter a name:")
            variable = readLine()
        }
        else{
            Name.add(variable.toString())
            i=1
      println("Please enter a college:")
            variable = readLine()
        }
}

    println(Name)
    println(College)
    println(Age)
    println(Game)}
