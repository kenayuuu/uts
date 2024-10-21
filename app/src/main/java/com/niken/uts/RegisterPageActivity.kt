package com.niken.uts

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterPageActivity : AppCompatActivity() {

    private lateinit var btnSignUp : Button
    private lateinit var textView8 : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register_page)

        btnSignUp = findViewById(R.id.btnSignUp)
        textView8 = findViewById(R.id.textView8)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnSignUp.setOnClickListener() {
            //untuk pindah page : intent
            //intent 2 : intent implicit dan intent explicit
            //inten implicit : intent kita buat sendiri dan yang belaku didalam project
            //intent expilicit : kita memanggil pihak ketiga / third party / libray : gmaps, gps,
            val intentMenu2 = Intent(this@RegisterPageActivity, LoginPageActivity::class.java)
            startActivity(intentMenu2)
        }

        textView8.setOnClickListener() {
            //untuk pindah page : intent
            //intent 2 : intent implicit dan intent explicit
            //inten implicit : intent kita buat sendiri dan yang belaku didalam project
            //intent expilicit : kita memanggil pihak ketiga / third party / libray : gmaps, gps,
            val intentMenu2 = Intent(this@RegisterPageActivity, LoginPageActivity::class.java)
            startActivity(intentMenu2)
        }
    }
}