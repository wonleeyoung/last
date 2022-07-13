package com.wonyoung.last

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner_address)
        spinner.adapter = ArrayAdapter.createFromResource(this,R.array.itemList,android.R.layout.simple_spinner_item)
    }
}