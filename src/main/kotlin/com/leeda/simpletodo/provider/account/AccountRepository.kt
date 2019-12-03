package com.leeda.simpletodo.provider.account

import com.leeda.simpletodo.core.domain.account.Account
import com.leeda.simpletodo.core.usecase.AccountSavePort
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long>, AccountSavePort