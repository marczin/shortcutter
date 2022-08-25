package pl.marcinrosol.shortcutter.services

import org.springframework.http.ResponseEntity
import pl.marcinrosol.shortcutter.models.UrlResponse
import pl.marcinrosol.shortcutter.models.dtos.UrlDto
import pl.marcinrosol.shortcutter.models.requests.UrlRequest

interface UrlService {

    fun createShortUrl(url: UrlRequest): UrlDto
    fun getShortcut(uuid: String): UrlResponse
    fun getOriginUrl(uuid: String): String

}