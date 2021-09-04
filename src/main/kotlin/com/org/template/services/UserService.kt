package com.org.template.services

import com.org.template.controllers.dto.UserInput
import com.org.template.controllers.dto.UserOutput
import com.org.template.models.User
import com.org.template.models.UserDetailsImpl
import com.org.template.repositories.UserRepository
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder
) {

    fun create(userInput: UserInput): UserOutput {
        val user = User(
            username = userInput.username,
            email = userInput.email,
            passwordHash = bCryptPasswordEncoder.encode(userInput.password)
        )
        return userRepository.save(user).toOutput()
    }

    fun myself(): String? {
        return userRepository.findByEmail(getCurrentUserEmail())?.username
    }

    private fun getCurrentUserEmail(): String {
        val user = SecurityContextHolder.getContext().authentication.principal as UserDetailsImpl
        return user.username
    }
}
