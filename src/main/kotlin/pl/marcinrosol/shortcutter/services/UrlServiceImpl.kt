package pl.marcinrosol.shortcutter.services

import org.apache.commons.codec.binary.Base32
import java.security.SecureRandom;
import org.springframework.stereotype.Service
import pl.marcinrosol.shortcutter.models.requests.UrlRequest

@Service
class UrlServiceImpl : UrlService {

    override fun createShortUrl(url: UrlRequest) {
        val uuid = prepareUserFriendlyUuid(4)

    }

    private fun prepareUserFriendlyUuid(size: Int) : String {
        val secureRandom = SecureRandom()
        val random = ByteArray(size)
        secureRandom.nextBytes(random)
        return Base32().encodeAsString(random).replace("=","")
    }


}