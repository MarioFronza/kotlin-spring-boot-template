package com.org.template.models

import com.org.template.controllers.dto.UserOutput
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue
    val id: Long? = null,
    val username: String,
    val email: String,
    val passwordHash: String
) {
    fun toOutput() = UserOutput(
        id = id,
        username = username,
        email = email
    )
}
