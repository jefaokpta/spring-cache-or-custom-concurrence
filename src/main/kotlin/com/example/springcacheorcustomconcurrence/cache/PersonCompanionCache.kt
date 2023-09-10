package com.example.springcacheorcustomconcurrence.cache

import com.example.springcacheorcustomconcurrence.model.Person
import java.util.concurrent.ConcurrentHashMap

class PersonCompanionCache {

    companion object {
        private val cache = ConcurrentHashMap<String, Person>()

        fun get(name: String): Person? {
            return cache[name]
        }

        fun increment(name: String): Person {
            cache.getOrDefault(name, Person(name, 0)).let {
                val newPerson = Person(it.name, it.hit + 1)
                cache[name] = newPerson
                return newPerson
            }
        }
    }
}