package com.gabrielpadilh4.multitenant.domain.model

import java.util.UUID

class Tenant(
    val tenantId: UUID,
    val tenantName: String
) {
}