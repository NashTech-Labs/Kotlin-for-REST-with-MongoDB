package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinForRestWithMongoDbApplication

fun main(args: Array<String>) {
	runApplication<KotlinForRestWithMongoDbApplication>(*args)
}
