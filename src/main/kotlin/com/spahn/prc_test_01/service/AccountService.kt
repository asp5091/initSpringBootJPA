package com.spahn.prc_test_01.service

import com.spahn.prc_test_01.DTO.CreateAccountDTO
import com.spahn.prc_test_01.entity.Account
import com.spahn.prc_test_01.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class AccountService {

    @Autowired
    lateinit var accountRepo : AccountRepository

    fun getAcct(): MutableIterable<Account> {
        return accountRepo.findAll()
    }

    @Transactional
    fun createAcct(createDTO : CreateAccountDTO) : CreateAccountDTO{
        val acct = accountRepo.save(createDTO.toEntity())
        return acct.toCreateAccount()
    }
}