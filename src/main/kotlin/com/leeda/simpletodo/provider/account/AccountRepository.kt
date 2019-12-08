package com.leeda.simpletodo.provider.account

import com.leeda.simpletodo.core.domain.account.Account
import com.leeda.simpletodo.core.usecase.account.AccountSavePort
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : AccountSavePort, JpaRepository<Account, Long>