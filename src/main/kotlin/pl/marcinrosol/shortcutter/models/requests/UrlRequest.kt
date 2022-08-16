package pl.marcinrosol.shortcutter.models.requests

data class UrlRequest(
    var url: String,
    var customUrl: String,
    var strategy: UrlStrategy
) {
}