package com.example.todolist_kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class add_todo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_todo)

        var title = findViewById<EditText>(R.id.titleText)
        var body = findViewById<EditText>(R.id.bodyText)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            var todo = Todo(title = title.text.toString(), description = body.text.toString())
            var repo = Repository().repository
            repo.add(todo)
        }
    }
}