package com.example.springcacheorcustomconcurrence.cache

import com.example.springcacheorcustomconcurrence.model.Person
import org.springframework.cache.annotation.CachePut
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class PersonSpringCache {

    @Cacheable("persons", key = "#name")
    fun get(name: String) = Optional.empty<Person>()

    @CachePut("persons", key = "#person.name")
    fun increment(person: Person) = person.also { println("cached $person") }
}