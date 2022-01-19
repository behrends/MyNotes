package com.example.mynotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        val noteTitle = intent.getStringExtra("NOTE_TITLE")
        findViewById<TextView>(R.id.noteTitle).text = noteTitle
    }
}