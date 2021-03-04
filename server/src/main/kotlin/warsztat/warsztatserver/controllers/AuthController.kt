package warsztat.warsztatserver.controllers

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import warsztat.warsztatserver.models.ApplicationUser
import warsztat.warsztatserver.repositories.ApplicationUserRepository

@RestController
@RequestMapping("/api/auth")
class AuthController (
    val applicationUserRepository: ApplicationUserRepository,
    val bCryptPasswordEncoder: BCryptPasswordEncoder,
) {
    @PostMapping("/register")
    fun register(@RequestBody user: ApplicationUser) {
        user.password = bCryptPasswordEncoder.encode(user.password)
        applicationUserRepository.save(user)
    }
}