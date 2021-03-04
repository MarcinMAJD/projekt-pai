package warsztat.warsztatserver.security.filters

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.core.Authentication
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import warsztat.warsztatserver.models.ApplicationUser
import java.io.IOException
import java.lang.RuntimeException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class JWTAuthenticationFilter(
        val authManager: AuthenticationManager
) : UsernamePasswordAuthenticationFilter() {

    override fun attemptAuthentication(request: HttpServletRequest, response: HttpServletResponse): Authentication {
        try {
            val credentials = ObjectMapper()
                    .readValue(request.inputStream, ApplicationUser::class.java)



        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }
}