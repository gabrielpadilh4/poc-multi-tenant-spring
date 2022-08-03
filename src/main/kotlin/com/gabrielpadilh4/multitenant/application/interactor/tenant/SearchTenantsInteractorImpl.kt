package com.gabrielpadilh4.multitenant.application.interactor.tenant

import com.gabrielpadilh4.multitenant.domain.interactor.tenant.SearchTenantsInteractor
import com.gabrielpadilh4.multitenant.domain.model.Tenant
import com.gabrielpadilh4.multitenant.domain.service.TenantService
import org.springframework.stereotype.Component

@Component
class SearchTenantsInteractorImpl(
    private val tenantService: TenantService
): SearchTenantsInteractor {
    override fun execute(): List<Tenant> {
        return tenantService.searchTenants()
    }
}