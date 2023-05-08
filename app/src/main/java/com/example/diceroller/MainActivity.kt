package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
    }

    private fun rollDice() {
        val dice6 = Dice(6);
        val diceRoll = dice6.makeRoll();
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

        val dice20 = Dice(20);
        val diceRoll20 = dice20.makeRoll();
        val resultTextView20: TextView = findViewById(R.id.textView2);
        resultTextView20.text = diceRoll20.toString();
    }

}

class Dice(private val numSides: Int){
    fun makeRoll(): Int{
        return (1..numSides).random();
    }
}