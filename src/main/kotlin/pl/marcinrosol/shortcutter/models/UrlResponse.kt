package pl.marcinrosol.shortcutter.models

import java.util.Date

data class UrlResponse(
    var uuid: String,
    var createDate: Date,
    var validateDate: Date,
    var url: String,
    var alias: String?
) {
}