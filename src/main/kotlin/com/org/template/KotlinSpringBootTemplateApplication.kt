package com.org.template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootTemplateApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootTemplateApplication>(*args)
}
