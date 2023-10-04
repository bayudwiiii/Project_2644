package com.example.project_2644

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnFairy: Button = findViewById(R.id.buttonMenu1)

        btnFairy.setOnClickListener{
            val Intent = Intent(this,BookKidActivity::class.java)
            startActivity(Intent)
        }
    }
}