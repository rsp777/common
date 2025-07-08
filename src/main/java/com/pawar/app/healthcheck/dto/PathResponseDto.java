package com.pawar.app.healthcheck.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public record PathResponseDto(Integer id, @JsonProperty("pathName") String pathName,
		@JsonProperty("pathDescription") String pathDescription,
		@JsonInclude(JsonInclude.Include.NON_NULL) @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC") @JsonProperty("createdDttm") LocalDateTime createdDttm,
		@JsonInclude(JsonInclude.Include.NON_NULL) @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC") @JsonProperty("lastUpdatedDttm") LocalDateTime lastUpdatedDttm,
		@JsonInclude(JsonInclude.Include.NON_NULL) @JsonProperty("createdSource") String createdSource,
		@JsonInclude(JsonInclude.Include.NON_NULL) @JsonProperty("lastUpdatedSource") String lastUpdatedSource) {
}