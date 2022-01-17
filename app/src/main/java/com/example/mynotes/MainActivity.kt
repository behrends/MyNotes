package com.example.mynotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<EditText>(R.id.editNoteTitle)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val noteTitle = title.text.toString()
            Toast.makeText(this, noteTitle, Toast.LENGTH_LONG).show()
        }
    }
}