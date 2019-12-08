package com.leeda.simpletodo.provider.todo

import com.leeda.simpletodo.core.domain.todo.ToDo
import com.leeda.simpletodo.core.usecase.todo.ToDoSavePort
import org.springframework.data.jpa.repository.JpaRepository

interface ToDoRepository : ToDoSavePort, JpaRepository<ToDo, Long>