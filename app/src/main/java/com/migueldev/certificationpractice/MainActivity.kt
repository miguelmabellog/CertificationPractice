package com.migueldev.certificationpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        corebutton.setOnClickListener {
            val coreIntent= Intent(this,CoreActivity::class.java)
            startActivity(coreIntent)
        }
        uibutton.setOnClickListener {
            val uiIntent=Intent(this,UserInterfaceActivity::class.java)
            startActivity(uiIntent)
        }

        databutton.setOnClickListener {
            val dataIntent=Intent(this,DataActivity::class.java)
            startActivity(dataIntent)
        }



    }
}