package com.example.mynotes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val editText = view.findViewById<EditText>(R.id.editNoteTitle)
        view.findViewById<Button>(R.id.button).setOnClickListener {
            val noteTitle = editText.text.toString()
            if(noteTitle.trim().isEmpty()) {
                editText.error = "Titel darf nicht leer sein."
            } else {
                view.findNavController().navigate(R.id.action_homeFragment_to_editFragment)
            }
        }
        return view;
    }
}