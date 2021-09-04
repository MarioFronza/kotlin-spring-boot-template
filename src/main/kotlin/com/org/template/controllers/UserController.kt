package com.org.template.controllers

import com.org.template.controllers.dto.UserInput
import com.org.template.controllers.dto.UserOutput
import com.org.template.services.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/users")
class UserController(
    private val userService: UserService
) {

    @PostMapping
    fun create(@RequestBody userInput: UserInput): ResponseEntity<UserOutput> {
        val user = userService.create(userInput)
        return ResponseEntity.created(URI("")).body(user)
    }

    @GetMapping("/me")
    fun me() = ResponseEntity.ok(userService.myself()!!)
}
