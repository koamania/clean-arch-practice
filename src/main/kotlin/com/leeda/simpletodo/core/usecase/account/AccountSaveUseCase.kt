package com.leeda.simpletodo.core.usecase.account

import com.leeda.simpletodo.core.domain.account.Account

interface AccountSaveUseCase {

    fun saveNewUser(mail: String, password: String, name: String): Account
}