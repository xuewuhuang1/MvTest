package com.example.mvtest.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvtest.DataModel
import com.example.mvtest.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MvpActivity : AppCompatActivity(),Presenter.IView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)
        Presenter(this).setData()
    }

    override fun showData(data1: String, data2: String) {
        textView.text = data1
        textView2.text = data2
    }
}
