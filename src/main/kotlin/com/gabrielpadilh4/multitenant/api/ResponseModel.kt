package com.gabrielpadilh4.multitenant.api

import com.fasterxml.jackson.annotation.JsonInclude
import org.springframework.hateoas.RepresentationModel
import org.springframework.http.HttpStatus


@JsonInclude(JsonInclude.Include.NON_NULL)
data class ResponseModel<T>(
    var status: StatusModel,
    var errors: Any?,
    var content: T?,
    var details: String?
) : RepresentationModel<ResponseModel<T>>() {

    constructor(status: StatusModel, content: T) : this(status, errors = null, content = null, details = null)

    constructor(status: StatusModel, errors: MutableList<String>) : this(status, errors = errors, content = null, details = null)

    constructor(status: StatusModel, errors: MutableList<String>, details: String?) : this(status, errors = errors, content = null, details = details)

}