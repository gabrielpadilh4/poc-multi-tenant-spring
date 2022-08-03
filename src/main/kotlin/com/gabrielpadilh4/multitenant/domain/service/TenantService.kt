package com.gabrielpadilh4.multitenant.domain.service

import com.gabrielpadilh4.multitenant.domain.model.Tenant

interface TenantService {
    fun searchTenants(): List<Tenant>
}