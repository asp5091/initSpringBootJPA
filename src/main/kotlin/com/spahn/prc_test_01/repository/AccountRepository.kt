package com.spahn.prc_test_01.repository

import com.spahn.prc_test_01.entity.Account
import org.springframework.data.repository.CrudRepository

interface AccountRepository : CrudRepository<Account, Long>{
    fun findAllBy(): List<Account>
}