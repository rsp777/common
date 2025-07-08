package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

public record ServerResponseDto(Integer id, String hostname, String ipAddress, String osType, String status,
		LocalDateTime lastHealthChecked, LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm, String createdSource,
		String lastUpdatedSource) {
}