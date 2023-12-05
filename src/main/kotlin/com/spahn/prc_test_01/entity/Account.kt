package com.spahn.prc_test_01.entity

import com.spahn.prc_test_01.DTO.CreateAccountDTO
import com.spahn.prc_test_01.DTO.GetAccountDTO
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Account (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,
    val username: String? = null
) {
    fun toGetAccount(): GetAccountDTO {
        return GetAccountDTO(id = id, name = username)
    }
    fun toCreateAccount(): CreateAccountDTO {
        return CreateAccountDTO(name = username)
    }
}