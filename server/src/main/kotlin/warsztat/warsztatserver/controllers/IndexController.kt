package warsztat.warsztatserver.controllers

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class IndexController {
    @GetMapping("/api/index")
    fun getIndex(): String = "Hello world"
}