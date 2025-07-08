package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ScriptResponseDto(Integer id, @JsonProperty("scriptName") String scriptName,
		@JsonProperty("scriptExtension") String scriptExtension, @JsonProperty("createdDttm") LocalDateTime createdDttm,
		@JsonProperty("lastUpdatedDttm") LocalDateTime lastUpdatedDttm,
		@JsonProperty("createdSource") String createdSource,
		@JsonProperty("lastUpdatedSource") String lastUpdatedSource) {
}