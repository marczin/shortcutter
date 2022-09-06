package pl.marcinrosol.shortcutter.configurations

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.postgres.PostgresPlugin
import javax.sql.DataSource

@Configuration
class JdbiConfiguration {

    @Bean
    fun jdbi(dataSource: DataSource) : Jdbi {
        return Jdbi.create(dataSource)
            .installPlugin(PostgresPlugin())
    }

}