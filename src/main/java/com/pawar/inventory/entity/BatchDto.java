package com.pawar.inventory.entity;

import java.time.OffsetDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BatchDto {

	private Long id;
	private String batchId;
	private int status;
	private OffsetDateTime createdAt;
	private OffsetDateTime updatedAt;

	public BatchDto(String batchId, int status) {
		this.batchId = batchId;
		this.status = status;
	}
}
