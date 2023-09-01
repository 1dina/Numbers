package com.example.num


fun main(args:Array<String>) {
    var start =0
    var indexOfRandom =0
    var end =19
    val Name = arrayOf("Mahmoud", "Mohammed", "Suzan", "Alaa", "Zeinab")
    val College = arrayOf("CIS", "Science", "pharmacy", "Medicine", "Engineering")
    val Age = arrayOf("20", "25", "18", "23", "27")
    val Game = arrayOf("Football", "Basketball", "volleyball", "Karate", "Chess")
    val arrayOfRandom =Array(20){""}
for (i in 0..end){
var ChooseIndex = (0..4).random()
    var isFoundName = false
    var isFoundAge = false
    var isFoundCollege = false
    var isFoundGame = false
    start=0
    for (j in start..19){
        if(Name[ChooseIndex]==arrayOfRandom[j]||isFoundName) {
            start=0
            isFoundName=true
            if (College[ChooseIndex] == arrayOfRandom[j]||isFoundCollege){
                start=0
                isFoundCollege=true
                if (Age[ChooseIndex] == arrayOfRandom[j]||isFoundAge){
                    start=0
                    isFoundAge=true
                    if (Game[ChooseIndex] == arrayOfRandom[j]||isFoundGame){
                        isFoundGame=true
                    }
                }
            }
        }
    }
    if(!isFoundName) {
        arrayOfRandom[indexOfRandom]=Name[ChooseIndex]
        print(arrayOfRandom[indexOfRandom]+" ")
        indexOfRandom++
    }else if (!isFoundCollege)   { arrayOfRandom[indexOfRandom] = College[ChooseIndex]
        print(arrayOfRandom[indexOfRandom]+" ")
        indexOfRandom++ }
    else if (!isFoundAge)  { arrayOfRandom[indexOfRandom] = Age[ChooseIndex]
        print(arrayOfRandom[indexOfRandom]+" ")
        indexOfRandom++ }
    else if(!isFoundGame)  { arrayOfRandom[indexOfRandom] = Game[ChooseIndex]
        print(arrayOfRandom[indexOfRandom]+" ")
        indexOfRandom++
    }
  //
   else{
      end++
    }
  if(indexOfRandom==20) break


}
    println("")
    val chooseName = mutableListOf<String>()
    val chooseCollege = mutableListOf<String>()
    val chooseAge = mutableListOf<String>()
    val chooseGame = mutableListOf<String>()
    var input = readLine().toString()
    while(input!="FINISH"){
        for(i in 0..4){
            if(Name[i]==input) {
                chooseName.add(input)
                break
            }
            if(College[i]==input) {
                chooseCollege.add(input)
                break
            }
            if(Age[i]==input) {
                chooseAge.add(input)
                break
            }
            if(Game[i]==input) {
                chooseGame.add(input)
                break
            }
        }

        input = readLine().toString()
    }
  println("Name :"+chooseName)
    println("College :"+chooseCollege)
    println("Age :"+chooseAge)
    println("Game :"+chooseGame)


   }

