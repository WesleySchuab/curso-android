package com.example.pookotlinencapsulamento

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    lateinit var txtTitle : TextView
    lateinit var txtAuthor : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        startingLayoutsComponents()
        createObjects()


    }

    private fun startingLayoutsComponents() {
        txtTitle = findViewById(R.id.txtTitle)
        txtAuthor= findViewById(R.id.txtAuthor)
    }


    private fun createObjects() {
        var Book = Book ("Kotlin", "Wesley", "erica", "EUA", 1200)
        var title = Book.title
        var author = Book.author
        Log.i("#valeu", "createObjects: var title: "+title)
        Log.i("#valeu", "createObjects: var author: "+author)
        txtTitle.setText(title)
        txtAuthor.setText(author)

    }
}