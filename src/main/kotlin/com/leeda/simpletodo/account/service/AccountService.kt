package com.leeda.simpletodo.account.service

import com.leeda.simpletodo.core.entity.account.Account
import com.leeda.simpletodo.core.entity.account.AccountInfo
import com.leeda.simpletodo.account.domain.AccountRepository
import com.leeda.simpletodo.core.usecase.InsertNewUserUsecase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AccountService(
        // 얘를 use case 로 뺴야함.
        //현재는 Insert에 대한 부분 밖에 없으니까 Custom Repository로 signature method query를 interface로 분리하는거
        // 우선 자자
        @Autowired val accountRepository: AccountRepository
): InsertNewUserUsecase {

    @Transactional
    override fun insertNewUser(mail: String, password: String, name: String): Account {
        val account = Account()
        val newAccountInfo = AccountInfo("koamania@gmail.com", "123123", "genius")
        account.addAccountInfo(newAccountInfo)
        account.registerDate

        return accountRepository.save(account)
    }
}
