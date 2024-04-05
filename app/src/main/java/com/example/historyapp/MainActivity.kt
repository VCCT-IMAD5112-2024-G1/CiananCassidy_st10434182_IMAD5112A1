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

        val clickMeButton = findViewById<Button>(R.id.Generate)
        val textInput = findViewById<EditText>(R.id.Age)
        val textView = findViewById<TextView>(R.id.Figure)
        val clearButton = findViewById<Button>(R.id.Clear)

        clickMeButton.setOnClickListener{
            var message: String

            try {
                val text = textInput.text.toString().toInt()

                message = when {
                    text >= 52 -> "William Shakespeare, famous Play Writer, died"
                    text >= 95 -> "Nelson Mandela, figurehead of the equal rights movement, died"
                    text >= 35 -> "Marilyn Monroe, famous film actress, died"
                    text >= 75 -> "Mahatma Gandhi, spiritual leader, died"
                    text >= 63 -> "Robin Williams, famous actor, died"
                    text >= 85 -> "David Prowse, aka Darth Vader, died"
                    text >= 42 -> "Elvis Presley, famous singer, died"
                    text >= 51 -> "Ann Sheridan, famous TV actress, died"
                    text >= 25 -> "Wilfred Owen died"
                    text >= 49 -> "Jason David Frank died"
                    else -> "No one famous has died at that age. Please enter a different number"
                }
            } catch (e: NumberFormatException) {
                message = "Invalid input. Please enter a valid age."
            }

            textView.text = message
        }
    clearButton.setOnClickListener{
       clearButton.text=null
       textInput.text=null
    }





    }

}
