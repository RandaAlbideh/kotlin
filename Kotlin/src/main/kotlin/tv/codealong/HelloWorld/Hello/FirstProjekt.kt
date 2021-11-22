package tv.codealong.HelloWorld.Hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/HelloWorld")

class FirstProjekt {
    @GetMapping
    fun hello(): String{
        return "This is the first Kotlin Project By Randa"
    }
}