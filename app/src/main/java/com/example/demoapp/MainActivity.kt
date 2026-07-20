package com.example.demoapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button)

        tv.text = "عدد النقرات: $count"

        btn.setOnClickListener {
            count++
            tv.text = "عدد النقرات: $count"
        }
    }
}
