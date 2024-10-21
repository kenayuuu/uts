package com.niken.uts

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imageView5: ImageView = findViewById(R.id.imageView5)
        val detailTitleTextView: TextView = findViewById(R.id.detailTitleTextView)
        val commentEditText: EditText = findViewById(R.id.commentEditText)
        val button2: Button = findViewById(R.id.button2)

        // Get the data passed from the main activity
        val title = intent.getStringExtra("TITLE")
        val imageResId = intent.getIntExtra("IMAGE_RES_ID", R.drawable.img_11)

        // Set the data to the views
        detailTitleTextView.text = title
        imageView5.setImageResource(imageResId)

        button2.setOnClickListener {
            finish() // Close the activity
        }

        }
    }
