package pl.marcinrosol.shortcutter.services

import org.springframework.boot.autoconfigure.web.WebProperties
import org.springframework.stereotype.Service
import pl.marcinrosol.shortcutter.models.requests.UrlStrategy

@Service
class UrlStrategyServiceImpl : UrlStrategyService {

    override fun saveStrategy(urlStrategy: UrlStrategy) {
        TODO("Not yet implemented")
    }

    override fun getStrategy(uuid: String): WebProperties.Resources.Chain.Strategy {
        TODO("Not yet implemented")
    }
}