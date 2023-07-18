package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.log

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val histiryList = intent.getStringArrayExtra("history") ?: arrayOf<String>()
        //log.d("Histo",histiryList.size)
    }
}