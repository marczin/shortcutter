package pl.marcinrosol.shortcutter.models.requests

data class UrlRequest(
        var url: String,
        var customShortcut : String,
        var strategy: UrlStrategy
    ) {
}