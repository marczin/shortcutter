package pl.marcinrosol.shortcutter.repositories

import org.jdbi.v3.sqlobject.customizer.Bind
import org.springframework.stereotype.Repository
import pl.marcinrosol.shortcutter.models.dtos.UrlDto
import org.jdbi.v3.sqlobject.statement.SqlQuery

@Repository
interface UrlRepo {

    @SqlQuery("""
        SELECT uuid, url, alias, create_date
        FROM url_models WHERE uuid = :uuid OR alias = :uuid
        """)
    fun getUrl(@Bind("uuid") uuid: String) : UrlDto

}