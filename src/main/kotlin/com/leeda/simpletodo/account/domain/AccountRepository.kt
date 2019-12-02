package com.leeda.simpletodo.account.domain

import com.leeda.simpletodo.core.entity.account.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long>