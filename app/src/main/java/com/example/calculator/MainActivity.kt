package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.ActionMenuView
import com.example.calculator.databinding.ActivityMainBinding
import com.ezylang.evalex.Expression

class MainActivity : AppCompatActivity() {
    // https://developer.android.com/topic/libraries/view-binding#kts
    // ActivityMainBinding - название ФАЙЛА XML
    private lateinit var binding: ActivityMainBinding
    private val number_string_builder = StringBuilder()

    private val history_list = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // https://developer.android.com/topic/libraries/view-binding#kts
        //  start add
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // setContentView(R.layout.activity_main)
        // end add


//        val zeroButton = findViewById<Button>(R.id.zero_button)
//        val one_button = findViewById<Button>(R.id.one_button)
//        val two_button = findViewById<Button>(R.id.two_button)
//        val three_button = findViewById<Button>(R.id.three_button)
//        val four_button = findViewById<Button>(R.id.four_button)
//        val five_button = findViewById<Button>(R.id.five_button)
//        val six_button = findViewById<Button>(R.id.six_button)
//        val seven_button = findViewById<Button>(R.id.seven_button)
//        val eight_button = findViewById<Button>(R.id.eight_button)
//        val nine_button = findViewById<Button>(R.id.nine_button)
//
//        val equel_button = findViewById<Button>(R.id.equel_button)
//        val minus_button = findViewById<Button>(R.id.minus_button)
//        val multiply_button = findViewById<Button>(R.id.multiply_button)
//        val point_button = findViewById<Button>(R.id.point_button)
//        val plus_button = findViewById<Button>(R.id.plus_button)
//        var divide_button = findViewById<TextView>(R.id.divide_button)
//        var clear_button = findViewById<TextView>(R.id.clear_button)
//        var back_button = findViewById<TextView>(R.id.back_button)
//
        setListener()
    }

    private fun setListener() = with(binding){
        var result_textview = findViewById<TextView>(R.id.result_textview)
        oneButton.setOnClickListener{
            number_string_builder.append(1)
            result_textview.text = number_string_builder
        }

        twoButton.setOnClickListener{
            number_string_builder.append(2)
            result_textview.text = number_string_builder
        }
        threeButton.setOnClickListener{
            number_string_builder.append(3)
            result_textview.text = number_string_builder
        }
        fourButton.setOnClickListener{
            number_string_builder.append(4)
            result_textview.text = number_string_builder
        }
        fiveButton.setOnClickListener{
            number_string_builder.append(5)
            result_textview.text = number_string_builder
        }
        sixButton.setOnClickListener{
            number_string_builder.append(6)
            result_textview.text = number_string_builder
        }
        sevenButton.setOnClickListener{
            number_string_builder.append(7)
            result_textview.text = number_string_builder
        }
        eightButton.setOnClickListener{
            number_string_builder.append(8)
            result_textview.text = number_string_builder
        }
        nineButton.setOnClickListener{
            number_string_builder.append(9)
            result_textview.text = number_string_builder
        }
        zeroButton.setOnClickListener{
            number_string_builder.append(0)
            result_textview.text = number_string_builder
        }

        minusButton.setOnClickListener{
            number_string_builder.append("-")
            result_textview.text = number_string_builder
        }
        plusButton.setOnClickListener{
            number_string_builder.append("+")
            result_textview.text = number_string_builder
        }
        multiplyButton.setOnClickListener{
            number_string_builder.append("*")
            result_textview.text = number_string_builder
        }
        pointButton.setOnClickListener{
            number_string_builder.append(".")
            result_textview.text = number_string_builder
        }
        divideButton.setOnClickListener{
            number_string_builder.append("/")
            result_textview.text = number_string_builder
        }
        clearButton.setOnClickListener{
            result_textview.text = ""
            number_string_builder.clear()
        }
        backButton.setOnClickListener{
            val lastindex = number_string_builder.length -1
            number_string_builder.deleteCharAt(lastindex)
            result_textview.text = number_string_builder
        }

        equelButton.setOnClickListener{
            saveToHistory()
            calculate(result_textview)
        }

        historyButton.setOnClickListener{
            // open new activity
            //  connect danni
            val h = history_list
            val intent = Intent(this@MainActivity, HistoryActivity::class.java)
            intent.putExtra("history",history_list.toTypedArray())
            startActivity(intent)

        }
    }

    private fun saveToHistory(){
        history_list.add(number_string_builder.toString())
    }

    private fun calculate(result_textview: TextView) {
        try {
            val result =
                Expression(number_string_builder.toString()).evaluate().numberValue.toString()
            result_textview.text = result
            number_string_builder.clear()
            number_string_builder.append(result.toString())
        } catch (t: Throwable) {
            Toast.makeText(this@MainActivity, "Excecption: $t", Toast.LENGTH_LONG).show()
        }
    }
}