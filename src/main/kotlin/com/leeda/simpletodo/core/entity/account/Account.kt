package com.leeda.simpletodo.core.entity.account

import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Account(
        @Id
        @GeneratedValue
        var id: Long? = null,
        @CreationTimestamp
        var registerDate: LocalDateTime = LocalDateTime.now()
) {
    @OneToMany(mappedBy = "account", cascade = [CascadeType.ALL])
    val accountInfoList: MutableSet<AccountInfo> = HashSet()

    fun addAccountInfo(accountInfo: AccountInfo) {
        this.accountInfoList.add(accountInfo)
        if (accountInfo.account != this@Account) {
            accountInfo.account = this@Account
        }
    }

    override fun toString(): String {
        return "Account(id=$id, registerDate=$registerDate, accountInfoList=$accountInfoList)"
    }


}
