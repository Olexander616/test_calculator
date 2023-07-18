package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import kotlin.math.log

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val histiryList = intent.getStringArrayExtra("history") ?: arrayOf<String>()
        //Log.d("Histo","$histiryList.size")

        val itemsAdapter : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, histiryList)
        val listView = findViewById<View>(R.id.list_item) as ListView
        listView.adapter = itemsAdapter

        val backbutton = findViewById<Button>(R.id.backlist_button)
        backbutton.setOnClickListener{
            val intent = Intent(this@HistoryActivity, MainActivity::class.java)
            //intent.putExtra("history",history_list.toTypedArray())
            startActivity(intent)
        }
    }
}