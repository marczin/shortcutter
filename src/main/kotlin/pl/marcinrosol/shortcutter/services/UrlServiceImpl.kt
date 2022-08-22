package pl.marcinrosol.shortcutter.services

import org.springframework.stereotype.Service
import pl.marcinrosol.shortcutter.error.ExistingUrlException
import pl.marcinrosol.shortcutter.models.dtos.UrlDto
import pl.marcinrosol.shortcutter.models.requests.UrlRequest
import pl.marcinrosol.shortcutter.utils.UuidUtils.Companion.prepareUserFriendlyUuid

@Service
class UrlServiceImpl : UrlService {

    override fun createShortUrl(request: UrlRequest) : UrlDto {
        val uuid = prepareUserFriendlyUuid(4)
        var model = prepareModel(uuid, request)
        //todo save model in database
        return model
    }

    private fun prepareModel(uuid: String, request: UrlRequest): UrlDto {
        checkCustomUrl(request.customUrl);
        return UrlDto(uuid, request.customUrl, request.url)
    }

    private fun checkCustomUrl(customUrl: String) {
        //todo do select on db, if custom url exist throw error
        throw ExistingUrlException("this url does exist")
    }


}