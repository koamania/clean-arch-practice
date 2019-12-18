package com.leeda.simpletodo.core.usecase.todo

import com.leeda.simpletodo.core.domain.account.Account
import com.leeda.simpletodo.core.domain.todo.ToDo
import com.leeda.simpletodo.core.usecase.UseCase

interface SaveToDoUseCase : UseCase<SaveToDoUseCase.SaveToDoRequest, SaveToDoUseCase.SaveToDoResponse> {
    data class SaveToDoRequest(val account: Account, val title: String, val description: String?) : UseCase.Request
    data class SaveToDoResponse(val todo: ToDo) : UseCase.Response
}