package com.pawar.inventory.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LogEntryDto {
	private Long id;
	private String batchId; // New field for batch ID
	private LocalDateTime timestamp;
	private String serviceName;
	private String logLevel;
	private String message;
	private String metadata;
	private String userId;
	private String ipAddress;
	private String moduleName;
	private String item; // New field for item
	private String location; // New field for location
	private String asn; // New field for ASN
	private String batchMode; // New field for batch Mode
	private LocalDateTime createdAt;

	@Override
	public String toString() {
		return "LogEntryDto [id=" + id + ", batchId=" + batchId + ", timestamp=" + timestamp + ", serviceName="
				+ serviceName + ", logLevel=" + logLevel + ", message=" + message + ", metadata=" + metadata
				+ ", userId=" + userId + ", ipAddress=" + ipAddress + ", moduleName=" + moduleName + ", item=" + item
				+ ", location=" + location + ", asn=" + asn + ", batchMode=" + batchMode + ", createdAt=" + createdAt
				+ "]";
	}

}
