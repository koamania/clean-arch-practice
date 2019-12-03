package com.leeda.simpletodo.core.domain.account

import javax.persistence.*

@Entity
data class AccountInfo(
        @Id
        @GeneratedValue
        var id: Long? = null,
        var mail: String,
        var password: String,
        var name: String
) {

    @ManyToOne
    @JoinColumn(name = "account_id", insertable = false, updatable = false)
    var account: Account? = null
        set(value) {
            field = value
            if (!value?.accountInfoList!!.contains(this)) {
                value.accountInfoList.add(this)
            }
        }

    constructor(mail: String, password: String, name: String) : this(null, mail, password, name)
}
