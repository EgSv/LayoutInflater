package ru.startandroid.develop.layoutinflater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView

const val LOG_TAG = "myLogs"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ltInflater:LayoutInflater = layoutInflater

        val linLayout = findViewById<LinearLayout>(R.id.linLayout)
        val view1:View? = ltInflater.inflate(R.layout.text, linLayout, true)
        val lp1 = view1?.layoutParams

        Log.d(LOG_TAG, "Class of view1 ${view1?.javaClass}")
        Log.d(LOG_TAG, "Class of layoutParams of view1: ${lp1?.javaClass.toString()}")

        val relLayout = findViewById<RelativeLayout>(R.id.relLayout)
        val view2 = ltInflater.inflate(R.layout.text, relLayout, true)
        val lp2 = view2.layoutParams

        Log.d(LOG_TAG, "Class of view2: ${view2.javaClass}")
        Log.d(LOG_TAG, "Class of layoutParams of view2: ${lp2?.javaClass.toString()}")
    }
}