package com.gabrielpadilh4.multitenant.infrastructure.mapper

import com.gabrielpadilh4.multitenant.domain.model.Tenant
import com.gabrielpadilh4.multitenant.infrastructure.entity.TenantEntity

object TenantInfrastructureMapper {
    fun mapEntityToDomain(tenantEntity: TenantEntity): Tenant{
        return Tenant(
            tenantId = tenantEntity.tenantId,
            tenantName = tenantEntity.tenantName
        )
    }
}