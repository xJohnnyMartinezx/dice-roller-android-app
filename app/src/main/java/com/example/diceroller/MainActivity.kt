package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        *** REFERENCING THE "Roll Dice!" BUTTON VIA ID ******
        val rollButton: Button = findViewById(R.id.button);

//        *** SETTING UP EVENT LISTER AND DISPLAYING MSG WHEN BTN IS TAPPED ********
        rollButton.setOnClickListener {
           val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}