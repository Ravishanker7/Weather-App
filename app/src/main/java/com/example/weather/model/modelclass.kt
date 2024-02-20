package com.example.weather.model

import com.example.weather.R

data class modelclass(val time: String,val image:Int,val degree:String,val day: String)

fun listofdata(): MutableList<modelclass>{

    val list= mutableListOf<modelclass>()
    list.add(modelclass("now",R.drawable.img_7,"19°","Monday" ))
    list.add(modelclass("13:00",R.drawable.img_8,"21°","Tuesday" ))
    list.add(modelclass("14:00",R.drawable.img_8,"20°","Wednesday" ))
    list.add(modelclass("15:00",R.drawable.img_9,"25°","Thursday" ))
    list.add(modelclass("16:00",R.drawable.img_7,"23°","Friday" ))
    list.add(modelclass("18:00",R.drawable.img_9,"18°","Saturday" ))


    return list
}