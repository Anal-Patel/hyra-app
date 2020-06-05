package com.example.hyra

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener {
            Log.i("Login", "Login was pressed!")
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)

        }

        Sign_up.setOnClickListener {
            Log.i("Signup", "Signup was Clicked!")
            val intent= Intent(this, signup_page::class.java)
            startActivity(intent)
        }
    }
}