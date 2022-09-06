package pl.marcinrosol.shortcutter.models.dtos

import java.util.Date

data class UrlDto(
    var uuid: String?,
    var alias: String?,
    var redirectUrl: String?,
    var createDate: Date?
) {
    constructor() : this(null, null, null, null)
}