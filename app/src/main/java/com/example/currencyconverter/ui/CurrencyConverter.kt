package com.example.currencyconverter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.currencyconverter.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CurrencyConverter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}