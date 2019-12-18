package com.leeda.simpletodo.adapter.todo

import com.leeda.simpletodo.core.domain.todo.ToDo
import com.leeda.simpletodo.core.usecase.todo.SaveToDoUseCase
import com.leeda.simpletodo.core.usecase.todo.ToDoSavePort
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SaveToDoUseCaseImpl(
        val todoSavePort: ToDoSavePort
) : SaveToDoUseCase {

    @Transactional
    override fun execute(saveRequestToDo: SaveToDoUseCase.SaveToDoRequest): SaveToDoUseCase.SaveToDoResponse {
        val todo = ToDo(null, saveRequestToDo.account, saveRequestToDo.title, saveRequestToDo.description)
        return SaveToDoUseCase.SaveToDoResponse(todoSavePort.save(todo))
    }
}