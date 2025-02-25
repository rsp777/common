package com.pawar.inventory.entity;

import java.time.LocalDateTime;

public class SopLocationRangeDto {

	private Integer id;
	private SopActionTypeDto sopActionType;
	private String category;
	private String fromLocation;
	private String toLocation;
	private int totalActiveLocations;
	private int usedActiveLocations;
	private int avlActiveLocations;
	private String isActive;
	private LocalDateTime createdDttm;
	private LocalDateTime lastUpdatedDttm;
	private String createdSource;
	private String lastUpdatedSource;

	public SopLocationRangeDto() {
	}
 
	public SopLocationRangeDto(Integer id, SopActionTypeDto sopActionTypeDto, String category, String fromLocation,
			String toLocation, int totalActiveLocations, int usedActiveLocations, int avlActiveLocations,
			String isActive, LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm, String createdSource,
			String lastUpdatedSource) {
		this.id = id;
		this.sopActionType = sopActionTypeDto;
		this.category = category;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.totalActiveLocations = totalActiveLocations;
		this.usedActiveLocations = usedActiveLocations;
		this.avlActiveLocations = avlActiveLocations;
		this.isActive = isActive;
		this.createdDttm = createdDttm;
		this.lastUpdatedDttm = lastUpdatedDttm;
		this.createdSource = createdSource;
		this.lastUpdatedSource = lastUpdatedSource;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SopActionTypeDto getSopActionType() {
		return sopActionType;
	}

	public void setSopActionType(SopActionTypeDto sopActionTypeDto) {
		this.sopActionType = sopActionTypeDto;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public int getTotalActiveLocations() {
		return totalActiveLocations;
	}

	public void setTotalActiveLocations(int totalActiveLocations) {
		this.totalActiveLocations = totalActiveLocations;
	}

	public int getUsedActiveLocations() {
		return usedActiveLocations;
	}

	public void setUsedActiveLocations(int usedActiveLocations) {
		this.usedActiveLocations = usedActiveLocations;
	}

	public int getAvlActiveLocations() {
		return avlActiveLocations;
	}

	public void setAvlActiveLocations(int avlActiveLocations) {
		this.avlActiveLocations = avlActiveLocations;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
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
		return "SopLocationRangeDto [id=" + id + ", sopActionTypeDto=" + sopActionType + ", category=" + category
				+ ", fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", totalActiveLocations="
				+ totalActiveLocations + ", usedActiveLocations=" + usedActiveLocations + ", avlActiveLocations="
				+ avlActiveLocations + ", isActive=" + isActive + ", createdDttm=" + createdDttm + ", lastUpdatedDttm="
				+ lastUpdatedDttm + ", createdSource=" + createdSource + ", lastUpdatedSource=" + lastUpdatedSource
				+ "]";
	}
}
