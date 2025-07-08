package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PathRequestDto(@NotNull Integer id, // Optional for creation, required for updates
		@NotBlank String pathName, String pathDescription, LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm,
		String createdSource, String lastUpdatedSource) {
}