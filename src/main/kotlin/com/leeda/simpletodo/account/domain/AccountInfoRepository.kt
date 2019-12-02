package com.leeda.simpletodo.account.domain

import com.leeda.simpletodo.core.entity.account.Account
import com.leeda.simpletodo.core.entity.account.AccountInfo
import org.springframework.data.jpa.repository.JpaRepository

interface AccountInfoRepository : JpaRepository<AccountInfo, Long> {
    fun findByAccount(newAccount: Account): AccountInfo?
}