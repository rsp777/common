package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record HttpMethodsResponseDto(@NotNull Integer id, // Optional for creation, required for updates
		@NotBlank String methodName, boolean allowedInHealthCheck,LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm,
		String createdSource, String lastUpdatedSource) {

}
