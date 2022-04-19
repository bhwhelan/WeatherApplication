package com.app.weather.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.weather.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart(){
        super.onStart()
    }

}