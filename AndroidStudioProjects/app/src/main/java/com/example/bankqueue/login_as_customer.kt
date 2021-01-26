package com.example.bankqueue
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login_as_customer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_as_customer)
        var butgmail = findViewById<Button>(R.id.buttonlogingmail) as Button;
        butgmail.setOnClickListener {
            val intent= Intent(this,Customerpart::class.java)
            startActivity(intent)
        }
        var butface = findViewById<Button>(R.id.buttonloginfacebook) as Button;
        butface.setOnClickListener {
            val intent= Intent(this,Customerpart::class.java)
            startActivity(intent)
        }
    }
}