package com.gabrielpadilh4.multitenant.application.mapper

import com.gabrielpadilh4.multitenant.application.response.tenant.TenantResponse
import com.gabrielpadilh4.multitenant.domain.model.Tenant

object TenantApplicationMapper {
    fun domainToResponse(tenant: Tenant): TenantResponse{
        return TenantResponse(
            tenantId = tenant.tenantId,
            tenantName = tenant.tenantName
        )
    }
}