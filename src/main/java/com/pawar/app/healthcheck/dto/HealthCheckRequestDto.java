package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record HealthCheckRequestDto(@NotNull Integer id, @NotBlank String url, Integer operationalPort, HttpMethodsRequestDto httpMethod,
		String expectedResponse, ServiceRequestDto service, LocalDateTime createdDttm,
		LocalDateTime lastUpdatedDttm, String createdSource, String lastUpdatedSource) {
}