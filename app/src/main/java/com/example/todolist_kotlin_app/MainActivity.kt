package com.example.todolist_kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerviewAdapter: TodoAdapter
    lateinit var recylerview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerviewAdapter = TodoAdapter(Repository().repository)
        recylerview = findViewById(R.id.rvTodoItems)

        recylerview.apply{
            adapter = recyclerviewAdapter
            layoutManager = LinearLayoutManager(this)
        }



    }

}