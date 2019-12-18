package com.leeda.simpletodo.core.usecase.account

import com.leeda.simpletodo.core.domain.account.Account
import com.leeda.simpletodo.core.usecase.UseCase

interface SaveAccountUseCase : UseCase<SaveAccountUseCase.SaveAccountRequest, SaveAccountUseCase.SaveAccountResponse> {

    data class SaveAccountRequest(val mail: String, val password: String, val name: String) : UseCase.Request
    data class SaveAccountResponse(val account: Account) : UseCase.Response
}