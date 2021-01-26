package com.example.bankqueue

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Customerpart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customerpart)
        val i =0;
        var result: Int

        var butinc = findViewById<Button>(R.id.buttontambah) as Button;
        butinc.setOnClickListener {
            result = i+1;
            val strI = Integer.toString(result)
            val text: TextView = findViewById(R.id.texttambah) as TextView
            val textt: TextView = findViewById(R.id.texttambah1) as TextView
            text.setText(strI)
            textt.setText(strI)
        }
    }
}