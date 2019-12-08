package com.leeda.simpletodo.core.usecase.todo

import com.leeda.simpletodo.core.domain.account.Account

interface ToDoSaveUseCase {
    fun saveNewToDo(account: Account, title: String, description: String?)
}