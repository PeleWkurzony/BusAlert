package com.pele.busalert

import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar!!.hide()

        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext, "TEST", Toast.LENGTH_LONG).show()

    }

}