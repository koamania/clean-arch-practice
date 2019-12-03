package com.leeda.simpletodo.task

import com.leeda.simpletodo.core.domain.account.Account
import com.leeda.simpletodo.core.domain.account.ToDo
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
internal class TodoServiceTest {

    @Test
    fun TODO_entity_생성() {
        // Arrange
        val account = Account()
        val title = "은행가야함"
        val description = "신한은행 가야함. 빨리 가야함."

        // Act
        val todo = ToDo(account = account, title = title, description = description)

        // Assert
        assertEquals(account.id, todo.account.id)
        assertEquals(title, todo.title)
        assertEquals(description, todo.description)
    }
}