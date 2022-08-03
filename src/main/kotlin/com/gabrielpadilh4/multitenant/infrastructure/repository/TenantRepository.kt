package com.gabrielpadilh4.multitenant.infrastructure.repository

import com.gabrielpadilh4.multitenant.infrastructure.entity.TenantEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface TenantRepository: MongoRepository<TenantEntity, UUID> {
}