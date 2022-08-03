package com.gabrielpadilh4.multitenant.domain.interactor.tenant

import com.gabrielpadilh4.multitenant.domain.model.Tenant

interface SearchTenantsInteractor {
    fun execute(): List<Tenant>
}