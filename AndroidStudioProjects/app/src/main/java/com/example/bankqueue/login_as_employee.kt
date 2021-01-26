package com.example.bankqueue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login_as_employee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_as_employee)
        var butin = findViewById<Button>(R.id.buttonsignin) as Button;
        butin.setOnClickListener {
            val intent= Intent(this,Employeepart::class.java)
            startActivity(intent)
        }
    }
}