package com.example.historyapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        



        }
        val clickMeButton = findViewById<Button>(R.id.Generate)
        val textInput = findViewById<EditText>(R.id.Age)
        val textView = findViewById<TextView>(R.id.Figure)
        val switch = findViewById<Button>(R.id.Clear)


        clickMeButton.setOnClickListener{


        var message : String = ""
        var text : Int

        text = textInput.text.toString().toInt()

        if (text >= 52) {
            message = "William Shakespeare, famous Play Writer, died"
        } else if (text >= 95) {
            message = "Nelson Mandela, figurehead of the equal rights movement, died"
        } else if (text >= 35) {
            message = "Marilyn Monrroe, famous film actoress died"
        } else if (text >= 75){
            message = "Mahatma gandhi, siritual leader, died"
        } else if (text >= 63){
            message = "Robin Williams, famous actor, died"
        } else if (text >= 85){
            message = "David Prowse,aka Darth Vader, died"
        } else if (text >= 42) {
            message = "Elvis Presley, famous singer, died"
        } else if (text >= 51){
            message = "Ann Sheridian, famous TV actorees, died"
        } else if (text >= 25){
            message = "Wilfred Owen died"
        } else if (text >= 49){
            message = "Jason David Frank died"
        } else{
            message = "No one famous has died at that age. Please enter a different number"
        }
        textView.text = message




    }
}

