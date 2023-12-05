package com.spahn.prc_test_01

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
//@EntityScan(basePackages = {"com.spahn.prc_test_01.domain" })
//@EnableJpaRepositories(basePackages = {"com.spahn.prc_test_01.repository"})
class PrcTest01Application

fun main(args: Array<String>) {
    runApplication<PrcTest01Application>(*args)
}
