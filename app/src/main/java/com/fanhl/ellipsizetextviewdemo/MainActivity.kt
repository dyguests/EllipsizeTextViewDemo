package com.fanhl.ellipsizetextviewdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (0 until root.childCount).forEach {
            (root.getChildAt(it) as? TextView)?.setText(R.string.long_text)
        }
    }
}
