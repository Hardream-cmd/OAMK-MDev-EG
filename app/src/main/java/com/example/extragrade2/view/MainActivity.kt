package com.example.extragrade2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.extragrade2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //set the activity theme :
        setTheme(R.style.AppTheme_NoActionBar)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}