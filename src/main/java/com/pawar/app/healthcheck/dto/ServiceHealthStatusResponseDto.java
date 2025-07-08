package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ServiceHealthStatusResponseDto(@NotNull Integer id, @NotNull ServiceResponseDto service,
		ServerResponseDto server, @NotBlank String status, LocalDateTime timeStamp, @NotNull Long responseTime,
		@NotNull String errorMessage, LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm, String createdSource,
		String lastUpdatedSource) {
}