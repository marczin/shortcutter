package pl.marcinrosol.shortcutter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShortcutterApplication

fun main(args: Array<String>) {
	runApplication<ShortcutterApplication>(*args)
}
