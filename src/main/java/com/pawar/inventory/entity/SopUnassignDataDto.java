package com.pawar.inventory.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class SopUnassignDataDto {

	private Integer sopUnassignDataId;
	private int itemId;
	private String itemBrcd;
	private int locationId;
	private String locationBrcd;
	private String onHandQty;
	private int asnInTranQty;
	private int resvQty;
	private String category;
	private String logMessage;
	private String conditionLogMessage;
	private LocalDateTime createdDttm;
	private LocalDateTime lastUpdatedDttm;
	private String createdSource;
	private String lastUpdatedSource;
	
	public SopUnassignDataDto() {
	}
	
	public SopUnassignDataDto(Integer sopUnassignDataId, int itemId, String itemBrcd,int locationId, String locationBrcd,
			String onHandQty, int asnInTranQty, int resvQty, String category, String logMessage,
			String conditionLogMessage, LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm, String createdSource,
			String lastUpdatedSource) {
		this.sopUnassignDataId = sopUnassignDataId;
		this.itemId = itemId;
		this.locationId = locationId;
		this.itemBrcd = itemBrcd;
		this.locationBrcd = locationBrcd;
		this.onHandQty = onHandQty;
		this.asnInTranQty = asnInTranQty;
		this.resvQty = resvQty;
		this.category = category;
		this.logMessage = logMessage;
		this.conditionLogMessage = conditionLogMessage;
		this.createdDttm = createdDttm;
		this.lastUpdatedDttm = lastUpdatedDttm;
		this.createdSource = createdSource;
		this.lastUpdatedSource = lastUpdatedSource;
	}

	public Integer getSopUnassignDataId() {
		return sopUnassignDataId;
	}

	public void setSopUnassignDataId(Integer sopUnassignDataId) {
		this.sopUnassignDataId = sopUnassignDataId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemBrcd() {
		return itemBrcd;
	}

	public void setItemBrcd(String itemBrcd) {
		this.itemBrcd = itemBrcd;
	}
	

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationBrcd() {
		return locationBrcd;
	}

	public void setLocationBrcd(String locationBrcd) {
		this.locationBrcd = locationBrcd;
	}

	public String getOnHandQty() {
		return onHandQty;
	}

	public void setOnHandQty(String onHandQty) {
		this.onHandQty = onHandQty;
	}

	public int getAsnInTranQty() {
		return asnInTranQty;
	}

	public void setAsnInTranQty(int asnInTranQty) {
		this.asnInTranQty = asnInTranQty;
	}

	public int getResvQty() {
		return resvQty;
	}

	public void setResvQty(int resvQty) {
		this.resvQty = resvQty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLogMessage() {
		return logMessage;
	}

	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}

	public String getConditionLogMessage() {
		return conditionLogMessage;
	}

	public void setConditionLogMessage(String conditionLogMessage) {
		this.conditionLogMessage = conditionLogMessage;
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
		return "SopUnassignDataDto [sopUnassignDataId=" + sopUnassignDataId + ", itemId=" + itemId + ", itemBrcd="
				+ itemBrcd + ", locationId=" + locationId + ", locationBrcd=" + locationBrcd + ", onHandQty="
				+ onHandQty + ", asnInTranQty=" + asnInTranQty + ", resvQty=" + resvQty + ", category=" + category
				+ ", logMessage=" + logMessage + ", conditionLogMessage=" + conditionLogMessage + ", createdDttm="
				+ createdDttm + ", lastUpdatedDttm=" + lastUpdatedDttm + ", createdSource=" + createdSource
				+ ", lastUpdatedSource=" + lastUpdatedSource + "]";
	}	
}