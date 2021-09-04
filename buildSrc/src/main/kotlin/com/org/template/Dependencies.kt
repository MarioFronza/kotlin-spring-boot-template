package com.org.template

object Dependencies {
    val springBootDataJpa by lazy { "org.springframework.boot:spring-boot-starter-data-jpa:${Versions.springBoot}" }
    val springBootSecurity by lazy { "org.springframework.boot:spring-boot-starter-security:${Versions.springBoot}" }
    val springBootWeb by lazy { "org.springframework.boot:spring-boot-starter-web:${Versions.springBoot}" }
    val jackson by lazy { "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.jackson}" }
    val kotlinReflect by lazy { "org.jetbrains.kotlin:kotlin-reflect" }
    val kotlinJdk8 by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk8" }
    val jjwt by lazy { "io.jsonwebtoken:jjwt:${Versions.jjwt}" }
    val postgresql by lazy { "org.postgresql:postgresql:${Versions.postgresql}" }
    val springBootTest by lazy { "org.springframework.boot:spring-boot-starter-test:${Versions.springBoot}" }
    val springSecurityTest by lazy { "org.springframework.security:spring-security-test:${Versions.springSecurityTest}" }
    val detekt by lazy { "io.gitlab.arturbosch.detekt:detekt-formatting:${Versions.springSecurityTest}" }
}