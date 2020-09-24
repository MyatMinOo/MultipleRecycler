package com.mmm.mm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.mmm.mm.viewmodel.CalcViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)          
        setContentView(R.layout.activity_main)
        var calculate=ViewModelProvider(this).get(CalcViewModel::class.java)
        add.setOnClickListener {
            var number1=editOne.text.toString().toInt()
            var number2=editTwo.text.toString().toInt()
            calculate.setAdd(number1,number2)
            result.text=calculate.getAdd().toString()
        }
        sub.setOnClickListener {
            var number1=editOne.text.toString().toInt()
            var number2=editTwo.text.toString().toInt()
            calculate.setSub(number1,number2)
            result.text=calculate.getSub().toString()
        }
        mul.setOnClickListener {
            var number1=editOne.text.toString().toInt()
            var number2=editTwo.text.toString().toInt()
            calculate.setMul(number1,number2)
            result.text=calculate.getMul().toString()
        }
        div.setOnClickListener {
            var number1=editOne.text.toString().toInt()
            var number2=editTwo.text.toString().toInt()
            calculate.setDiv(number1,number2)
            result.text=calculate.getDiv().toString()
        }
    }
}