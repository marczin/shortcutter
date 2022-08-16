package pl.marcinrosol.shortcutter.models.dtos

data class UrlDto(
    var uuid: String?,
    var customUrl: String?,
    var redirectUrl: String?
) {
    constructor() : this(null, null, null)
}