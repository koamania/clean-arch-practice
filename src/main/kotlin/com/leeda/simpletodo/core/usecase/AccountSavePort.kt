package com.leeda.simpletodo.core.usecase

import com.leeda.simpletodo.core.domain.account.Account

interface AccountSavePort {
    fun save(account: Account): Account
}