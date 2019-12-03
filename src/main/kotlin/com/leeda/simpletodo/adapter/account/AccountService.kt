package com.leeda.simpletodo.adapter.account

import com.leeda.simpletodo.core.domain.account.Account
import com.leeda.simpletodo.core.domain.account.AccountInfo
import com.leeda.simpletodo.core.usecase.AccountSavePort
import com.leeda.simpletodo.core.usecase.InsertNewUserUsecase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AccountService(
        @Autowired val accountSavePort: AccountSavePort
): InsertNewUserUsecase {

    @Transactional
    override fun insertNewUser(mail: String, password: String, name: String): Account {
        val account = Account()
        val newAccountInfo = AccountInfo("koamania@gmail.com", "123123", "genius")
        account.addAccountInfo(newAccountInfo)

        return accountSavePort.save(account)
    }
}
