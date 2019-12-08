package com.leeda.simpletodo.adapter.account

import com.leeda.simpletodo.core.domain.account.Account
import com.leeda.simpletodo.core.domain.account.AccountInfo
import com.leeda.simpletodo.core.usecase.account.AccountSavePort
import com.leeda.simpletodo.core.usecase.account.AccountSaveUseCase
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AccountService(
        val accountSavePort: AccountSavePort
) : AccountSaveUseCase {

    @Transactional
    override fun saveNewUser(mail: String, password: String, name: String): Account {
        val account = Account()
        val newAccountInfo = AccountInfo("koamania@gmail.com", "123123", "genius")
        account.addAccountInfo(newAccountInfo)

        return accountSavePort.save(account)
    }
}
