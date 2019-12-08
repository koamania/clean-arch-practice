package com.leeda.simpletodo.adapter.todo

import com.leeda.simpletodo.core.domain.account.Account
import com.leeda.simpletodo.core.domain.todo.ToDo
import com.leeda.simpletodo.core.usecase.todo.ToDoSavePort
import com.leeda.simpletodo.core.usecase.todo.ToDoSaveUseCase
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ToDoService(
        val todoSavePort: ToDoSavePort
) : ToDoSaveUseCase {

    @Transactional
    override fun saveNewToDo(account: Account, title: String, description: String?) {
        val todo = ToDo(null, account, title, description)

        todoSavePort.save(todo)
    }
}