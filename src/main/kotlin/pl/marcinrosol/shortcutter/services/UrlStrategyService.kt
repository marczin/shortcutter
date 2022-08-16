package pl.marcinrosol.shortcutter.services

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy
import pl.marcinrosol.shortcutter.models.requests.UrlStrategy

interface UrlStrategyService {

    fun saveStrategy(urlStrategy: UrlStrategy)
    fun getStrategy(uuid: String) : Strategy

}