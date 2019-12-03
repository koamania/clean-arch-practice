package com.leeda.simpletodo.core.usecase

import com.leeda.simpletodo.core.domain.account.Account

interface InsertNewUserUsecase {

    fun insertNewUser(mail: String, password: String, name: String): Account
}