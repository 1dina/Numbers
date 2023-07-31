
package com.example.num


fun main(args:Array<String>){
   println("Please choose a number between 1 and 4 :")
    val number = readLine()!!.toInt()
    val game =Games(number = number)
    game.chooseGame()



}
 open class Games(var nameOfGame :String="",
                  var gamePlayersNumber:Int=0,
                  var gameBall : Boolean=false,
              var gameStatus : String="",var number :Int) {
    fun chooseGame(){
        when(number){
            1->{val foot=Football(numberOfGoalkeeper = 1)
                foot.display()}
            2->{val basketball=Basketball(heightOfGoal = 32)
                basketball.display()}
            3->{val karate=Karate(karateBelt = "White")
                karate.display()}
            4->{val chess=Chess(colorOfUrPieces = "White")
                chess.display()}

        }
    }

}
class Football(
    nameOfGame: String = "Football",
    gamePlayersNumber: Int = 11,
    gameBall: Boolean = true,
    gameStatus: String = "Collective",
    number: Int=1,
var numberOfGoalkeeper: Int
)
    :Games( nameOfGame,gamePlayersNumber,gameBall,gameStatus, number){

    fun display(){
        println("You choose number :$number so you get :\nName Of Game: $nameOfGame \nPlayers number: $gamePlayersNumber ")
        if(gameBall) println("There is a ball")
        else println("There is No ball")
        println("Game Status :$gameStatus\nNumber of goalkeeper is :$numberOfGoalkeeper")
    }

}
class Basketball(
    nameOfGame: String = "Basketball",
    gamePlayersNumber: Int = 5,
    gameBall: Boolean = true,
    gameStatus: String = "Collective",
    number: Int=2,
    var heightOfGoal:Int

)
    :Games( nameOfGame,gamePlayersNumber,gameBall,gameStatus, number ){
    fun display(){
        println("You choose number :$number so you get :\nName Of Game: $nameOfGame\nPlayers number: $gamePlayersNumber ")
        if(gameBall) println("There is a ball")
        else println("There is No ball")
        println("Game Status :$gameStatus\nHeight of goal is :$heightOfGoal m." )
    }

}
class Karate(
    nameOfGame: String = "Karate",
    gamePlayersNumber: Int = 1,
    gameBall: Boolean = false,
    gameStatus: String = "individual",
    number: Int =3,
    var karateBelt :String
)
    :Games( nameOfGame,gamePlayersNumber,gameBall,gameStatus, number ){

    fun display(){
        println("You choose number :$number so you get :\nName Of Game: $nameOfGame\nPlayers number: $gamePlayersNumber ")
        if(gameBall) println("There is a ball")
        else println("There is No ball")
        println("Game Status :$gameStatus\nYour color of belt is $karateBelt cause you are a beginner!")
    }

}
class Chess(
    nameOfGame: String = "Chess",
    gamePlayersNumber: Int = 1,
    gameBall: Boolean = false,
    gameStatus: String = "individual",
    number: Int =4,
    var colorOfUrPieces :String
)
    :Games( nameOfGame,gamePlayersNumber,gameBall,gameStatus, number ){
    fun display(){
        println("You choose number :$number so you get :\nName Of Game: $nameOfGame \nPlayers number: $gamePlayersNumber ")
        if(gameBall) println("There is a ball")
        else println("There is No ball")
        println("Game Status :$gameStatus\nYour color to play is :$colorOfUrPieces")
    }


}