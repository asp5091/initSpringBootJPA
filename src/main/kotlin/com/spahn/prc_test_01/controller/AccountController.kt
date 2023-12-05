package com.spahn.prc_test_01.controller

import com.spahn.prc_test_01.DTO.CreateAccountDTO
import com.spahn.prc_test_01.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountController {

    @Autowired
    private lateinit var accountService: AccountService

    @GetMapping("/accounts", produces = ["application/json"])
    fun getAccounts(): ResponseEntity<Any>{
        return ResponseEntity
            .ok()
            .body(accountService.getAcct())
    }

    @PostMapping("/account")
    fun createAccount(@RequestBody createDTO : CreateAccountDTO) : ResponseEntity<Any>{
        accountService.createAcct(createDTO)
        return ResponseEntity
            .ok()
            .body(true)
    }
}