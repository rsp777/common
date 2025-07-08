package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ServiceHealthStatusRequestDto(@NotNull Integer id,@NotNull ServiceRequestDto service,
		ServerRequestDto server, @NotBlank String status,LocalDateTime timestamp, @NotNull Long responseTime,
		@NotNull String errorMessage, LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm, String createdSource,
		String lastUpdatedSource) {
}