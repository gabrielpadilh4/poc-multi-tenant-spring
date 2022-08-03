package com.gabrielpadilh4.multitenant.domain.exception

class InvalidTenantException(override var message: String): RuntimeException(message) {
}