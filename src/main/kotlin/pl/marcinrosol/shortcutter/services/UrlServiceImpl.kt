package pl.marcinrosol.shortcutter.services

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import pl.marcinrosol.shortcutter.error.ExistingUrlException
import pl.marcinrosol.shortcutter.models.UrlResponse
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

    override fun getShortcut(uuid: String) : UrlResponse{
        TODO("Not yet implemented")
    }

    override fun getOriginUrl(uuid: String): String {
        TODO( "select in db for url with this id or alias")
        return "https://fullstackdeveloper.guru/2021/03/12/how-to-redirect-to-an-external-url-from-spring-boot-rest-controller/"
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