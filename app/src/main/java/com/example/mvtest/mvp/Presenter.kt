package com.example.mvtest.mvp

import com.example.mvtest.DataModel
class Presenter(private val iView:IView) {
    fun setData(){
        val data = DataModel.getData()
        iView.showData(data[0],data[1])
    }
    interface IView{
        fun showData(data1:String,data2:String)
    }
}