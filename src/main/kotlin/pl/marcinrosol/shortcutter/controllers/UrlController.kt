package pl.marcinrosol.shortcutter.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import pl.marcinrosol.shortcutter.models.UrlResponse
import pl.marcinrosol.shortcutter.models.requests.UrlRequest
import pl.marcinrosol.shortcutter.services.UrlService

@Controller(value = "/api/shortcut")
class UrlController constructor (val urlService : UrlService) {

    @PostMapping("/create")
    fun createNewShortUrl(@RequestBody request: UrlRequest) {
        urlService.createShortUrl(request)
    }

    @GetMapping
    fun getShortcut(uuid: String) : ResponseEntity<UrlResponse> {
        return ResponseEntity.status(HttpStatus.OK).body(urlService.getShortcut(uuid))
    }


}