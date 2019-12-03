package com.leeda.simpletodo.core.domain

import com.leeda.simpletodo.core.domain.account.AccountInfo
import org.junit.jupiter.api.Test

internal class AccountTest {

    @Test
    fun account_생성() {
        val newAccountInfo = AccountInfo("koamania@gmail.com", "123123", "genius")
    }
}