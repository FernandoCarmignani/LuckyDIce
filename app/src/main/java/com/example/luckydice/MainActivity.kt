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
        if (RollResult == luckyN){
            val tost = Toast.makeText(applicationContext, "You Win!",Toast.LENGTH_SHORT).show()
        }
        else if (RollResult == 1){
            val tostN = Toast.makeText(applicationContext, "You lose, you rolled a 1. Try again.!",Toast.LENGTH_SHORT).show()
        }
        else if (RollResult == 2){
            val tostN = Toast.makeText(applicationContext, "You lose, you rolled a 2. Try again.!",Toast.LENGTH_SHORT).show()
        }
        else if (RollResult == 3){
            val tostN = Toast.makeText(applicationContext, "You lose, you rolled a 3. Try again.!",Toast.LENGTH_SHORT).show()
        }
        else if (RollResult == 5){
            val tostN = Toast.makeText(applicationContext, "You lose, you rolled a 5. Try again.!",Toast.LENGTH_SHORT).show()
        }
        else {
            val tostN = Toast.makeText(applicationContext, "You lose, you rolled a 6. Try again.!",Toast.LENGTH_SHORT).show()
        }

    }
}
class Dice (val numSides: Int){
    fun roll(): Int{
        return(1..numSides).random()
    }
}