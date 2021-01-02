package com.example.bankqueue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login_as : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_as)
        var butcus = findViewById<Button>(R.id.buttonascustomer) as Button;
        butcus.setOnClickListener {
            val intent= Intent(this,login_as_customer::class.java)
            startActivity(intent)
        }
        var butem = findViewById<Button>(R.id.buttonasemployee) as Button;
        butem.setOnClickListener {
            val intent2= Intent(this,login_as_employee::class.java)
            startActivity(intent2)
        }
    }
}