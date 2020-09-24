package com.mmm.mm.viewmodel

import androidx.lifecycle.ViewModel

class CalcViewModel : ViewModel()
{
    var number1: Int =0
    var number2: Int =0
    var resultAll : Int =0
    fun getAdd():Int=resultAll
    fun setAdd(number1: Int, number2: Int) : Int
    {
        resultAll= number1 +number2
        return resultAll
    }
    fun getSub():Int=resultAll
    fun setSub(number1: Int,number2: Int) : Int
    {
        resultAll=number1-number2
        return resultAll
    }
    fun getMul() : Int=resultAll
    fun setMul(number1: Int,number2:Int) : Int
    {
        resultAll=number1*number2
        return resultAll
    }
    fun getDiv() : Int=resultAll
    fun setDiv(number1: Int,number2: Int) : Int
    {
        resultAll=number1/number2
        return resultAll
    }
}