package com.example.springcacheorcustomconcurrence.controller

import com.example.springcacheorcustomconcurrence.cache.PersonCache
import com.example.springcacheorcustomconcurrence.cache.PersonSpringCache
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/persons")
class PersonController(private val personCache: PersonCache, private val personService: PersonService) {

    @GetMapping("/get/{name}")
//    fun get(@PathVariable name: String) = personCache.get(name)
    fun get(@PathVariable name: String) = personService.get(name)

    @GetMapping("/increment/{name}")
//    fun increment(@PathVariable name: String) = personCache.increment(name)
    fun increment(@PathVariable name: String) = personService.increment(name)
}