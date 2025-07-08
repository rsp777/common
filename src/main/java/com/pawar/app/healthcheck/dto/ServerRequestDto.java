package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record ServerRequestDto(@NotNull Integer id,@NotBlank(message = "Hostname cannot be blank") String hostname,
		@NotBlank(message = "IP address is required") @Pattern(regexp = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$", message = "Invalid IP address format") String ipAddress,
		@NotBlank(message = "OS type is required") String osType,
		@NotNull(message = "Server status is required") String status, LocalDateTime lastHealthChecked,
		LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm, String createdSource, String lastUpdatedSource) {
}