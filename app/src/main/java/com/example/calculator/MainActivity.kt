package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.ezylang.evalex.Expression

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
        var divide_button = findViewById<TextView>(R.id.divide_button)
        var clear_button = findViewById<TextView>(R.id.clear_button)

        var result_textview = findViewById<TextView>(R.id.result_textview)

        val number_string_builder = StringBuilder()

        one_button.setOnClickListener{
            number_string_builder.append(1)
            result_textview.text = number_string_builder
        }

        two_button.setOnClickListener{
            number_string_builder.append(2)
            result_textview.text = number_string_builder
        }
        three_button.setOnClickListener{
            number_string_builder.append(3)
            result_textview.text = number_string_builder
        }
        four_button.setOnClickListener{
            number_string_builder.append(4)
            result_textview.text = number_string_builder
        }
        five_button.setOnClickListener{
            number_string_builder.append(5)
            result_textview.text = number_string_builder
        }
        six_button.setOnClickListener{
            number_string_builder.append(6)
            result_textview.text = number_string_builder
        }
        seven_button.setOnClickListener{
            number_string_builder.append(7)
            result_textview.text = number_string_builder
        }
        eight_button.setOnClickListener{
            number_string_builder.append(8)
            result_textview.text = number_string_builder
        }
        nine_button.setOnClickListener{
            number_string_builder.append(9)
            result_textview.text = number_string_builder
        }
        zeroButton.setOnClickListener{
            number_string_builder.append(0)
            result_textview.text = number_string_builder
        }

        minus_button.setOnClickListener{
            number_string_builder.append("-")
            result_textview.text = number_string_builder
        }
        plus_button.setOnClickListener{
            number_string_builder.append("+")
            result_textview.text = number_string_builder
        }
        multiply_button.setOnClickListener{
            number_string_builder.append("*")
            result_textview.text = number_string_builder
        }
        point_button.setOnClickListener{
            number_string_builder.append(".")
            result_textview.text = number_string_builder
        }
        divide_button.setOnClickListener{
            number_string_builder.append("/")
            result_textview.text = number_string_builder
        }
        clear_button.setOnClickListener{
            result_textview.text = ""
            number_string_builder.clear()
        }

        equel_button.setOnClickListener{
            val result =  Expression(number_string_builder.toString()).evaluate().numberValue.toString()
            result_textview.text = result
            number_string_builder.clear()
            number_string_builder.append(result.toString())
        }

    }
}