package com.leeda.simpletodo.account.service

import com.leeda.simpletodo.adapter.account.AccountService
import com.leeda.simpletodo.core.usecase.AccountSavePort
import com.leeda.simpletodo.provider.account.AccountInfoRepository
import com.leeda.simpletodo.core.usecase.InsertNewUserUsecase
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@DataJpaTest
internal class AccountServiceTest(
        @Autowired val accountRepository: AccountSavePort,
        @Autowired val accountInfoRepository: AccountInfoRepository
) {

    @Test
    fun 사용자_인서트_테스트() {
        val insertNewUserUseCase: InsertNewUserUsecase = AccountService(accountRepository)
        val newAccount = insertNewUserUseCase.insertNewUser("koamania@gmail.com", "123123", "genius")

        println(newAccount)

        val accountInfo = accountInfoRepository.findByAccount(newAccount)
        println(accountInfo)
    }
}