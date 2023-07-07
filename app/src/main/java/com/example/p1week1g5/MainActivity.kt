package com.example.p1week1g5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var rollbtn : Button
    lateinit var textView2 : TextView
    lateinit var imageView : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val rollBtn : Button = findViewById(R.id.rollBtn)
        textView2  = findViewById(R.id.textView2)
        imageView = findViewById(R.id.imageView)
        rollbtn = findViewById(R.id.rollBtn)

        rollbtn.setOnClickListener{ rollDice() }
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        Toast.makeText(this, "Rolled", Toast.LENGTH_SHORT).show()

        val drawableResources = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice

        }

        imageView.setImageResource(drawableResources)
        textView2 = findViewById(R.id.textView2)
        textView2.text = randomInt.toString()
    }
}