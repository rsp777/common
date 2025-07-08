package com.pawar.app.healthcheck.dto;

import java.time.Instant;
import java.util.Map;

public record ServiceErrorResponseDto(Instant timestamp, int status, String error, String message, String path,
		Map<String, String> validationErrors) {

	public ServiceErrorResponseDto(int status, String error, String message, String path) {
		this(Instant.now(), status, error, message, path, null);
	}

	public ServiceErrorResponseDto withValidationErrors(Map<String, String> errors) {
		return new ServiceErrorResponseDto(timestamp, status, error, message, path, errors);
	}
}