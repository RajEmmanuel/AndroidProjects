package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val expBtn = findViewById<Button>(R.id.btnExp)
        val moreDetBtn = findViewById<Button>(R.id.moreDetails)

        expBtn.setOnClickListener {
            intent = Intent(this, ExperienceActivity::class.java)
            startActivity(intent)
        }
        moreDetBtn.setOnClickListener {
            intent = Intent(this, MoreDetails::class.java)
            startActivity(intent)
        }
    }
}