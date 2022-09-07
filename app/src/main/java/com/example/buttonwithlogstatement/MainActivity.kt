package com.example.buttonwithlogstatement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.countBtn)
        val btn2 = findViewById<Button>(R.id.button2)
        btn2.visibility = View.GONE

        val txt = findViewById<TextView>(R.id.countView)

        var incr_by = 1
        var counter = 0

        btn2.setOnClickListener{
            incr_by +=  1
            btn2.text = "Upgrade to add " + (incr_by + 1).toString()
            btn.text = "Add " + incr_by.toString()
            btn2.visibility = View.GONE
        }

        btn.setOnClickListener{
            counter += incr_by
            if((counter / 100.0) >= incr_by){
                btn2.visibility = View.VISIBLE
            }
            txt.text = counter.toString()
        }
    }
}