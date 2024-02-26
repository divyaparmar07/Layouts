package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ToastExample : AppCompatActivity() {

    lateinit var showToast : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_example)

        showToast = findViewById(R.id.buttonShowToast)

        showToast.setOnClickListener {
            Toast.makeText(this,"This is Toast Message",Toast.LENGTH_LONG).show()
        }
    }
}