package com.example.loginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SuccessLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_login)

        var user: TextView = findViewById(R.id.textView2);
        val profileName=intent.getStringExtra("Username")
        user.text = "You are logged in ${profileName}"
    }
}
