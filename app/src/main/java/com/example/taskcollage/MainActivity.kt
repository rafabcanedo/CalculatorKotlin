package com.example.taskcollage

import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.taskcollage.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        getSupportActionBar()?.hide()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // val calculo = findViewById<TextView>(R.id.firstContainer)

        val calculo = binding.firstContainer

        binding.one.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }

        binding.two.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }

        binding.three.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }

        binding.four.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }

        binding.five.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }

        binding.six.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }

        binding.seven.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }

        binding.eight.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }

        binding.nine.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }

        binding.zero.setOnClickListener {
            calculo.text = "${calculo.text}0"
        }

        binding.plus.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }

        binding.devide.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }

        binding.multiply.setOnClickListener {
            calculo.text = "${calculo.text}x"
        }

        binding.less.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }

        binding.virgula.setOnClickListener {
            calculo.text = "${calculo.text},"
        }

        binding.dot.setOnClickListener {
            calculo.text = "${calculo.text}."
        }

        binding.clear.setOnClickListener {
            calculo.text = ""
            binding.resultContainer.text= ""
        }

        binding.equal.setOnClickListener {
            val resultTotal = Expression(calculo.text.toString()).calculate()

            if (resultTotal.isNaN()){
                binding.resultContainer.text= "Expressão inválida!"
            }else{
                binding.resultContainer.text = resultTotal.toString()
            }
        }

    }
}