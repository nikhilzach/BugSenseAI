package com.example.imageclassification

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewActivity_Remedies : AppCompatActivity() {

    lateinit var text_view2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newactivity_remedies)

        val inputValue = intent.getStringExtra("inputValue").toString()
        // Now you can use the "inputValue" variable in your NewActivity

        text_view2 = findViewById(R.id.textView2)
        text_view2.setText("Remedies: "+inputValue)

        if(inputValue=="None")
            text_view2.setText("Dei Dei ninak onnum illa..pinne enthinaa potta")


    }
}