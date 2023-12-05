package com.spahn.prc_test_01.DTO

import com.spahn.prc_test_01.entity.Account

data class GetAccountDTO (
        val id : Long? = null,
        val name : String? = null
        )
data class CreateAccountDTO (
        val name : String? = null
){
        fun toEntity() : Account {
                return Account(username = name)
        }
}