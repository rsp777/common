package com.pawar.inventory.entity;

import java.time.LocalDateTime;

public class SopActionTypeDto {

	private Integer sopActionTypeId;
	private String actionDesc;
	private String actionType;
	private LocalDateTime createdDttm;
	private LocalDateTime lastUpdatedDttm;
	private String createdSource;
	private String lastUpdatedSource;

	public SopActionTypeDto() {
	}

	public SopActionTypeDto(Integer sopActionTypeId, String actionDesc, String actionType, LocalDateTime createdDttm,
			LocalDateTime lastUpdatedDttm, String createdSource, String lastUpdatedSource) {
		this.sopActionTypeId = sopActionTypeId;
		this.actionDesc = actionDesc;
		this.actionType = actionType;
		this.createdDttm = createdDttm;
		this.lastUpdatedDttm = lastUpdatedDttm;
		this.createdSource = createdSource;
		this.lastUpdatedSource = lastUpdatedSource;
	}

	public Integer getSopActionTypeId() {
		return sopActionTypeId;
	}

	public void setSopActionTypeId(Integer sopActionTypeId) {
		this.sopActionTypeId = sopActionTypeId;
	}

	public String getActionDesc() {
		return actionDesc;
	}

	public void setActionDesc(String actionDesc) {
		this.actionDesc = actionDesc;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public LocalDateTime getCreatedDttm() {
		return createdDttm;
	}

	public void setCreatedDttm(LocalDateTime createdDttm) {
		this.createdDttm = createdDttm;
	}

	public LocalDateTime getLastUpdatedDttm() {
		return lastUpdatedDttm;
	}

	public void setLastUpdatedDttm(LocalDateTime lastUpdatedDttm) {
		this.lastUpdatedDttm = lastUpdatedDttm;
	}

	public String getCreatedSource() {
		return createdSource;
	}

	public void setCreatedSource(String createdSource) {
		this.createdSource = createdSource;
	}

	public String getLastUpdatedSource() {
		return lastUpdatedSource;
	}

	public void setLastUpdatedSource(String lastUpdatedSource) {
		this.lastUpdatedSource = lastUpdatedSource;
	}

	@Override
	public String toString() {
		return "SopActionTypeDto [sopActionTypeId=" + sopActionTypeId + ", actionDesc=" + actionDesc + ", actionType=" + actionType
				+ ", createdDttm=" + createdDttm + ", lastUpdatedDttm=" + lastUpdatedDttm + ", createdSource="
				+ createdSource + ", lastUpdatedSource=" + lastUpdatedSource + "]";
	}
}
