package com.example.luckydice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val FirstDice = Dice(6)
        val RollResult = FirstDice.roll()
        val luckyN = 4
        val Tost  = Toast.makeText(applicationContext, "You win!",Toast.LENGTH_SHORT)
        val Tost1  = Toast.makeText(applicationContext, "You lose, you rolled a 1",Toast.LENGTH_SHORT)
        val Tost2  = Toast.makeText(applicationContext, "You lose, you rolled a 2",Toast.LENGTH_SHORT)
        val Tost3  = Toast.makeText(applicationContext, "You lose, you rolled a 3",Toast.LENGTH_SHORT)
        val Tost5  = Toast.makeText(applicationContext, "You lose, you rolled a 5",Toast.LENGTH_SHORT)
        val Tost6  = Toast.makeText(applicationContext, "You lose, you rolled a 6",Toast.LENGTH_SHORT)
        when (RollResult){
            luckyN -> Tost.show()
            1 -> Tost1.show()
            2 -> Tost2.show()
            3 -> Tost3.show()
            5 -> Tost5.show()
            6 -> Tost6.show()

        }

    }
}
class Dice (val numSides: Int){
    fun roll(): Int{
        return(1..numSides).random()
    }
}