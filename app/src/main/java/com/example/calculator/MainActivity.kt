package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zeroButton = findViewById<Button>(R.id.zero_button)
        val one_button = findViewById<Button>(R.id.one_button)
        val two_button = findViewById<Button>(R.id.two_button)
        val three_button = findViewById<Button>(R.id.three_button)
        val four_button = findViewById<Button>(R.id.four_button)
        val five_button = findViewById<Button>(R.id.five_button)
        val six_button = findViewById<Button>(R.id.six_button)
        val seven_button = findViewById<Button>(R.id.seven_button)
        val eight_button = findViewById<Button>(R.id.eight_button)
        val nine_button = findViewById<Button>(R.id.nine_button)

        val equel_button = findViewById<Button>(R.id.equel_button)
        val minus_button = findViewById<Button>(R.id.minus_button)
        val multiply_button = findViewById<Button>(R.id.multiply_button)
        val point_button = findViewById<Button>(R.id.point_button)
        val plus_button = findViewById<Button>(R.id.plus_button)

        val result_textview = findViewById<TextView>(R.id.result_textview)

        val number_string_builder = StringBuilder()

        one_button.setOnClickListener{
            number_string_builder.append(1)
            result_textview.text = number_string_builder
        }

    }
}