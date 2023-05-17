package com.example.tutorial12_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.lv)

        val taskList = arrayListOf<String>()
        taskList.add("DSA")
        taskList.add("Reading Book")
        taskList.add("Cook food")

        //adapter is used to connect listView with data
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val text = "Clicked on: " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

    }
}