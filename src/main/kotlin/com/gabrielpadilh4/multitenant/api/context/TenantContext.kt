package com.gabrielpadilh4.multitenant.api.context

object TenantContext {
    private val CONTEXT = ThreadLocal<String>()

    var tenantId: String?
        get() = CONTEXT.get()
        set(tenantId) {
            CONTEXT.set(tenantId)
        }

    fun clear() {
        CONTEXT.remove()
    }
}