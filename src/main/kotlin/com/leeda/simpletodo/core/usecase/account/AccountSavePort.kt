package com.leeda.simpletodo.core.usecase.account

import com.leeda.simpletodo.core.domain.account.Account

interface AccountSavePort {
    fun save(account: Account): Account
}