package com.gabrielpadilh4.multitenant.application.service

import com.gabrielpadilh4.multitenant.domain.model.Tenant
import com.gabrielpadilh4.multitenant.domain.service.TenantService
import com.gabrielpadilh4.multitenant.infrastructure.mapper.TenantInfrastructureMapper
import com.gabrielpadilh4.multitenant.infrastructure.repository.TenantRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TenantServiceImpl(
    private val tenantRepository: TenantRepository
): TenantService {
    override fun searchTenants(): List<Tenant> {
        return tenantRepository.findAll()
            .stream()
            .map(TenantInfrastructureMapper::mapEntityToDomain)
            .collect(Collectors.toList())
    }
}