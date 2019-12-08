package com.leeda.simpletodo.core.domain.todo

import com.leeda.simpletodo.core.domain.account.Account
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
        @Column(nullable = true)
        var description: String? = null,
        var isComplete: Boolean = false
) {

}
