package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CommandResponseDto(@NotNull Integer id, // Optional for creation, required for updates
		@NotBlank String name, String description,String parameters,String status,String result, LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm,
		String createdSource, String lastUpdatedSource) {

}
