package com.leeda.simpletodo.provider.account

import com.leeda.simpletodo.core.domain.account.Account
import com.leeda.simpletodo.core.domain.account.AccountInfo
import org.springframework.data.jpa.repository.JpaRepository

interface AccountInfoRepository : JpaRepository<AccountInfo, Long> {
    fun findByAccount(account: Account): AccountInfo?
}