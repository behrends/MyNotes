package com.example.mynotes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
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
                intent.putExtra("NOTE_TITLE", noteTitle)
                startForResult.launch(intent)
            }
        }
    }

    private val startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val intent = result.data
                // Alternativ in Kotlin: intent?.getBooleanExtra(...)!!
                if(intent != null && intent.getBooleanExtra("DELETE_NOTE", false)) {
                    binding.editNoteTitle.setText("")
                }
            }
        }
}