package pl.marcinrosol.shortcutter.services

import pl.marcinrosol.shortcutter.models.dtos.UrlDto
import pl.marcinrosol.shortcutter.models.requests.UrlRequest

interface UrlService {

    fun createShortUrl(url: UrlRequest) : UrlDto

}