package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ScriptRequestDto(@NotNull Integer id, // Optional for creation, required for updates
		@NotBlank String scriptName, @NotNull String scriptExtension, LocalDateTime createdDttm,
		LocalDateTime lastUpdatedDttm, String createdSource, String lastUpdatedSource) {
}