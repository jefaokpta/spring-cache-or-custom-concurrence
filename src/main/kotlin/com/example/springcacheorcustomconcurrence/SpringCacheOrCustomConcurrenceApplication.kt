package com.example.springcacheorcustomconcurrence

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class SpringCacheOrCustomConcurrenceApplication

fun main(args: Array<String>) {
    runApplication<SpringCacheOrCustomConcurrenceApplication>(*args)
}
