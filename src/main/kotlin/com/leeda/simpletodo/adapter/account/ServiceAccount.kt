package com.leeda.simpletodo.adapter.account

import com.leeda.simpletodo.core.domain.account.Account
import com.leeda.simpletodo.core.domain.account.AccountInfo
import com.leeda.simpletodo.core.usecase.account.AccountSavePort
import com.leeda.simpletodo.core.usecase.account.SaveAccountUseCase
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ServiceAccount(
        val accountSavePort: AccountSavePort
) : SaveAccountUseCase {

    @Transactional
    override fun execute(saveAccountURequest: SaveAccountUseCase.SaveAccountRequest): SaveAccountUseCase.SaveAccountResponse {
        val account = Account()
        val newAccountInfo = AccountInfo(saveAccountURequest.mail, saveAccountURequest.password, saveAccountURequest.name)
        account.addAccountInfo(newAccountInfo)

        return SaveAccountUseCase.SaveAccountResponse(accountSavePort.save(account))
    }
}
