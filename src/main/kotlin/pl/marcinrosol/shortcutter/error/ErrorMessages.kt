package pl.marcinrosol.shortcutter.error

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ErrorMessages {

    @ExceptionHandler(ExistingUrlException::class)
    fun existingUrlExceptionHandler(exception: Exception) : ResponseEntity<ErrorMessageModel> {
        return ResponseEntity(ErrorMessageModel(
            HttpStatus.CONFLICT.value(),
            exception.message),
            HttpStatus.CONFLICT)
    }
}

class ExistingUrlException(message: String) : RuntimeException(message) {}
