package warsztat.warsztatserver.models

import javax.persistence.*

enum class ApplicationUserType {
    REGULAR,
    MANAGER,
    ADMIN
}

@Entity
data class ApplicationUser(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false, unique = true)
    val username: String,
    var password: String,

    @Column(nullable = false)
    val userType: ApplicationUserType,
)