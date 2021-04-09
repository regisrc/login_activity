package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var btn: Button? = null
    private var login: EditText? = null
    private var password: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addListenerOnButton()
    }

    fun addListenerOnButton() {
        var btn: Button = findViewById(R.id.button);

        btn.setOnClickListener {
            var login: EditText = findViewById(R.id.editText2);
            var password: EditText = findViewById(R.id.editText);

            var correctLogin: String = "filipe";
            var correctPassword: String = "regis";

            if (correctLogin == login.text.toString() && correctPassword == password.text.toString()) {
                val intent = Intent(this@MainActivity, SuccessLogin::class.java)
                intent.putExtra("Username", correctLogin)
                startActivity(intent)
            } else {
                Toast.makeText(
                    this,
                    "Credentials are invalid!", Toast.LENGTH_SHORT
                ).show();
            }
        };
    }
}