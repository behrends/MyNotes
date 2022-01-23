package com.example.mynotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent


class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        val noteTitle = intent.getStringExtra("NOTE_TITLE")
        findViewById<TextView>(R.id.noteTitle).text = noteTitle
        findViewById<Button>(R.id.button2).setOnClickListener {
            val data = Intent()
            data.putExtra("DELETE_NOTE", true)
            setResult(RESULT_OK, data)
            finish()
        }
    }
}