package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AgentRequestDto(@NotNull Integer id, @NotBlank String name, String host, Integer port, String status,
		ServerResponseDto server, String jarFilePath, String jarVersion, LocalDateTime lastDeployment,
		LocalDateTime lastHeartbeat, LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm, String createdSource,
		String lastUpdatedSource) {
}