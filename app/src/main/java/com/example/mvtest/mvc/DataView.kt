package com.example.mvtest.mvc

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.mvtest.MainActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class DataView(context: Context?, attrs: AttributeSet?) : ConstraintLayout(context, attrs),MainActivity.IView {
    override fun showData(data1: String, data2: String) {
        textView.text = data1
        textView2.text = data2
    }

}