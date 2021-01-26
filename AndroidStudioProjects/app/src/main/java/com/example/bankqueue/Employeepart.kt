package com.example.bankqueue

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Employeepart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employeepart)
        val i =0;
        var result: Int
        //val `val`: Int = i.getText().toString().toInt()

        var butinc = findViewById<Button>(R.id.buttontambah) as Button;
        butinc.setOnClickListener {
            result = i+1;
            val strI = Integer.toString(result)
            val text: TextView = findViewById(R.id.texttambah) as TextView
            text.setText(strI)
        }
    }
}