package com.gabrielpadilh4.multitenant.application.response.tenant

import io.swagger.v3.oas.annotations.media.Schema
import java.util.UUID

@Schema(title = "Tenant")
class TenantResponse(
    @field:Schema(description = "Tenant identifier", nullable = false)
    val tenantId: UUID,
    @field:Schema(description = "Tenant name", nullable = false)
    val tenantName: String
) {
}