package com.gabrielpadilh4.multitenant.infrastructure.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document("tenants")
class TenantEntity(
    @Id
    val tenantId: UUID,
    val tenantName: String
) {
}