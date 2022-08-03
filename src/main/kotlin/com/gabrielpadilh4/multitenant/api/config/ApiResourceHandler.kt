package com.gabrielpadilh4.multitenant.api.config

import com.gabrielpadilh4.multitenant.api.ResponseModel
import com.gabrielpadilh4.multitenant.api.StatusModel
import com.gabrielpadilh4.multitenant.domain.exception.InvalidTenantException
import org.springframework.context.MessageSource

import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class ApiResourceHandler(private val messageSource: MessageSource) : ResponseEntityExceptionHandler() {

    @ExceptionHandler(InvalidTenantException::class)
    fun handleTenantHeaderRequest(ex: InvalidTenantException, request: WebRequest): ResponseEntity<Any?>? {
        val status = HttpStatus.FORBIDDEN
        val response = ResponseModel<Any>(
            status = StatusModel(
                HttpStatus.FORBIDDEN.value()
            ),
            errors = mutableListOf(CONSTRAINT_VIOLATION_EXCEPTION)
        )
        return handleExceptionInternal(ex, response, HttpHeaders(), status, request)
    }

    companion object {
        private const val CONSTRAINT_VIOLATION_EXCEPTION =
            "Fail to validate Tenant header request. Check http headers."
    }

}