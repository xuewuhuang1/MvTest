package com.example.mvtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = DataModel.getData()
        dataView.showData(data[0],data[1])
    }
    interface IView{
        fun showData(data1:String,data2:String)
    }
}
