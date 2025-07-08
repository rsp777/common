package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record HealthCheckResponseDto(@NotNull Integer id, // Optional for creation, required for updates
		@NotBlank String url, Integer operationalPort, HttpMethodsResponseDto httpMethod, String expectedResponse,
		ServiceResponseDto serviceResponseDto, LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm,
		String createdSource, String lastUpdatedSource) {
}