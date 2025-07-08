package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

public record ServiceResponseDto(
		Integer id, 
		ServerResponseDto server, 
		String serviceName, 
		PathResponseDto path,
		ScriptResponseDto script, 
		String healthCheckUrl, 
		LocalDateTime lastHealthChecked, 
		LocalDateTime createdAt,
		LocalDateTime updatedAt, 
		String createdSource, 
		String lastUpdatedSource) {

}