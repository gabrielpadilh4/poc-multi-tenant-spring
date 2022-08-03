package com.gabrielpadilh4.multitenant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class MultiTenantApplication

fun main(args: Array<String>) {
	runApplication<MultiTenantApplication>(*args)
}
