package com.gabrielpadilh4.multitenant.api.config

import com.gabrielpadilh4.multitenant.api.context.TenantContext
import com.gabrielpadilh4.multitenant.domain.exception.InvalidTenantException
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class TenantInterceptor : HandlerInterceptor {

    private val TENANT_HEADER = "X-Tenant"

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {

        val tenantId = request.getHeader(TENANT_HEADER)

        if(tenantId.isNullOrBlank()){
            throw InvalidTenantException("")
        }

        TenantContext.tenantId = tenantId

        return super.preHandle(request, response, handler)
    }

    override fun postHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any, modelAndView: ModelAndView?) {
        TenantContext.clear()
    }
}