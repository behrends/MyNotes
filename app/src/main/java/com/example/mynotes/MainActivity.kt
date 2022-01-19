package com.example.mynotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mynotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val noteTitle = binding.editNoteTitle.text.toString()
            if(noteTitle.trim().isEmpty()) {
                binding.editNoteTitle.error = "Titel darf nicht leer sein."
            } else {
                val intent = Intent(this, EditActivity::class.java)
                startActivity(intent)
            }
        }
    }
}