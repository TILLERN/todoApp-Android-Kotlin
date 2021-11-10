package com.example.todolist_kotlin_app

data class Todo (
    val title: String,
    var isChecked:Boolean = false
)