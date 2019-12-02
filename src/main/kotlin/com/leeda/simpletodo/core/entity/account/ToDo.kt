package com.leeda.simpletodo.core.entity.account

import com.leeda.simpletodo.core.entity.account.Account
import javax.persistence.*

@Entity
data class ToDo(
        @Id
        @GeneratedValue
        var id: Long? = null,
        @ManyToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "account_id")
        var account: Account,
        var title: String,
        var description: String
) {

}
