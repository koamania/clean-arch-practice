package com.leeda.simpletodo.core.usecase.todo

import com.leeda.simpletodo.core.domain.todo.ToDo

interface ToDoSavePort {
    fun save(todo: ToDo): ToDo
}