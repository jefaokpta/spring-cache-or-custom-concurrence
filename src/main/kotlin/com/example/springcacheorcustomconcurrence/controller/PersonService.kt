package com.example.springcacheorcustomconcurrence.controller

import com.example.springcacheorcustomconcurrence.cache.PersonCompanionCache
import com.example.springcacheorcustomconcurrence.cache.PersonSpringCache
import com.example.springcacheorcustomconcurrence.model.Person
import org.springframework.stereotype.Service

@Service
class PersonService(private val personSpringCache: PersonSpringCache) {

//    fun get(name: String) = personSpringCache.get(name)
    fun get(name: String) = PersonCompanionCache.get(name)

//    fun increment(name: String) = personSpringCache.get(name)
//        .map { personSpringCache.increment(it.copy(hit = it.hit + 1)) }
//        .orElseGet { personSpringCache.increment(Person(name, 1)) }
    fun increment(name: String) = PersonCompanionCache.increment(name)

}