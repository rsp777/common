package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ServiceRequestDto(@NotNull Integer id,@NotNull ServerResponseDto server, @NotBlank String serviceName, @NotNull PathResponseDto path,
		@NotNull ScriptResponseDto script, @NotBlank String healthCheckUrl, LocalDateTime lastHealthChecked,LocalDateTime createdDttm,
		LocalDateTime lastUpdatedDttm, String createdSource, String lastUpdatedSource) {
}