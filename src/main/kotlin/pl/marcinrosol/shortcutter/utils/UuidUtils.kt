package pl.marcinrosol.shortcutter.utils

import org.apache.commons.codec.binary.Base32
import java.security.SecureRandom

class UuidUtils {
    companion object {
        fun prepareUserFriendlyUuid(size: Int): String {
            val secureRandom = SecureRandom()
            val random = ByteArray(size)
            secureRandom.nextBytes(random)
            return Base32().encodeAsString(random).replace("=", "")
        }
    }
}