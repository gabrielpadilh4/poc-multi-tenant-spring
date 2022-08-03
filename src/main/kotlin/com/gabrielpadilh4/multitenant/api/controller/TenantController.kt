package com.gabrielpadilh4.multitenant.api.controller

import com.gabrielpadilh4.multitenant.api.Endpoints
import com.gabrielpadilh4.multitenant.application.mapper.TenantApplicationMapper
import com.gabrielpadilh4.multitenant.application.response.tenant.TenantResponse
import com.gabrielpadilh4.multitenant.domain.interactor.tenant.SearchTenantsInteractor
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.stream.Collectors

@RestController
@RequestMapping(Endpoints.tenantResource, produces = [MediaType.APPLICATION_JSON_VALUE])
@Tag(name = "Tenant")
class TenantController(
    private val searchTenantsInteractor: SearchTenantsInteractor
) {

    @GetMapping
    fun searchTenants(): ResponseEntity<List<TenantResponse>> {
        val tenants = searchTenantsInteractor.execute()
            .stream()
            .map(TenantApplicationMapper::domainToResponse)
            .collect(Collectors.toList())

        return ResponseEntity.ok(tenants)
    }
}