package com.example.androidavanzadoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var etEmail: EditText? = null
    var etPass: EditText? = null
    var btnSignIn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etEmail = findViewById(R.id.et_email)
        etPass = findViewById(R.id.et_pass)
        btnSignIn = findViewById(R.id.btn_signin)

        btnSignIn!!.setOnClickListener {
            if (etEmail?.text == null || !etEmail?.text.toString().contains("@")) {
                Toast.makeText(
                    it.context,
                    "Complete email address. Must contain @",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (etPass?.text == null || etPass?.length() < 7) {
                Toast.makeText(
                    it.context,
                    "Complete password with at least 7 characters.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
