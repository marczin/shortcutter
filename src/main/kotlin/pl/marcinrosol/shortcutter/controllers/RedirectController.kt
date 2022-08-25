package pl.marcinrosol.shortcutter.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import pl.marcinrosol.shortcutter.services.UrlService
import java.net.URI

@Controller
class RedirectController constructor(val urlService: UrlService) {

    @GetMapping("/{uuid}")
    fun redirect(@PathVariable(value = "uuid") uuid : String) : ResponseEntity<Void> {
        var redirectUrl = urlService.getOriginUrl(uuid)
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(redirectUrl)).build()
    }

}