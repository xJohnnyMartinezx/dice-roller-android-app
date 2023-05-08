package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        *** REFERENCING THE "Roll Dice!" BUTTON VIA ID ******
        val rollButton: Button = findViewById(R.id.button);

//        *** SETTING UP EVENT LISTER AND DISPLAYING MSG WHEN BTN IS TAPPED ********
        rollButton.setOnClickListener {

//            **** THIS SHOWS A TOAST MSG WHEN BTN IS TAPPED *********
//           val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT);
//            toast.show();

//            ****** SHOWS THE NUMBER 6 WHEN BTN IS TAPPED *********
//            val resultTextView: TextView = findViewById(R.id.textView);
//            resultTextView.text = "6";

//            ****** CALLING rollDice FUNCTION *****
            rollDice();
        }

//        CALLING rollDice ON APP STARTUP
        rollDice();
    }

    private fun rollDice() {
        val dice6 = Dice(6);
        val diceRoll = dice6.makeRoll();
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.visibility = View.INVISIBLE;
        val diceImage: ImageView = findViewById(R.id.imageView);
        val luckyNum = 4;

        when(diceRoll) {

            1 -> diceImage.setImageResource(R.drawable.dice_1);
            2 -> diceImage.setImageResource(R.drawable.dice_2);
            3 -> diceImage.setImageResource(R.drawable.dice_3);
            4 -> diceImage.setImageResource(R.drawable.dice_4);
            5 -> diceImage.setImageResource(R.drawable.dice_5);
            6 -> diceImage.setImageResource(R.drawable.dice_6);

        }
        when(diceRoll) {

            luckyNum -> resultTextView.visibility = View.VISIBLE;
        }

//        val dice20 = Dice(20);
//        val diceRoll20 = dice20.makeRoll();
//        val resultTextView20: TextView = findViewById(R.id.textView2);
//        resultTextView20.text = diceRoll20.toString();
    }

}

class Dice(private val numSides: Int){
    fun makeRoll(): Int{
        return (1..numSides).random();
    }
}