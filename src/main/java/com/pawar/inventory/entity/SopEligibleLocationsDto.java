package com.pawar.inventory.entity;

import java.time.LocalDateTime;


public class SopEligibleLocationsDto {

	
	private Integer sopEligibleLocationsId;
	private int locn_id;
	private String locn_brcd;
	private String grp;
	private int assignedNbrOfUpc;
	private int maxNbrOfSku;
	private SopLocationRangeDto sopLocationRange;
	private String category;
	private float length;
	private float width;
	private float height;
	private LocalDateTime createdDttm;
	private LocalDateTime lastUpdatedDttm;
	private String createdSource;
	private String lastUpdatedSource;

	public SopEligibleLocationsDto() {
	}
	public SopEligibleLocationsDto(Integer sopEligibleLocationsId, int locn_id, String locn_brcd, String grp,
			int assignedNbrOfUpc, int maxNbrOfSku, SopLocationRangeDto sopLocationRange, String category, float length,
			float width, float height, LocalDateTime createdDttm, LocalDateTime lastUpdatedDttm, String createdSource,
			String lastUpdatedSource) {
		this.sopEligibleLocationsId = sopEligibleLocationsId;
		this.locn_id = locn_id;
		this.locn_brcd = locn_brcd;
		this.grp = grp;
		this.assignedNbrOfUpc = assignedNbrOfUpc;
		this.maxNbrOfSku = maxNbrOfSku;
		this.sopLocationRange = sopLocationRange;
		this.category = category;
		this.length = length;
		this.width = width;
		this.height = height;
		this.createdDttm = createdDttm;
		this.lastUpdatedDttm = lastUpdatedDttm;
		this.createdSource = createdSource;
		this.lastUpdatedSource = lastUpdatedSource;
	}

	public Integer getSopEligibleLocationsId() {
		return sopEligibleLocationsId;
	}

	public void setSopEligibleLocationsId(Integer sopEligibleLocationsId) {
		this.sopEligibleLocationsId = sopEligibleLocationsId;
	}

	public int getLocn_id() {
		return locn_id;
	}

	public void setLocn_id(int locn_id) {
		this.locn_id = locn_id;
	}

	public String getLocn_brcd() {
		return locn_brcd;
	}

	public void setLocn_brcd(String locn_brcd) {
		this.locn_brcd = locn_brcd;
	}

	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}

	public int getAssignedNbrOfUpc() {
		return assignedNbrOfUpc;
	}

	public void setAssignedNbrOfUpc(int assignedNbrOfUpc) {
		this.assignedNbrOfUpc = assignedNbrOfUpc;
	}

	public int getMaxNbrOfSku() {
		return maxNbrOfSku;
	}

	public void setMaxNbrOfSku(int maxNbrOfSku) {
		this.maxNbrOfSku = maxNbrOfSku;
	}

	public SopLocationRangeDto getSopLocationRange() {
		return sopLocationRange;
	}

	public void setSopLocationRangeDto(SopLocationRangeDto sopLocationRange) {
		this.sopLocationRange = sopLocationRange;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
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
		return "SopEligibleLocations [sopEligibleLocationsId=" + sopEligibleLocationsId + ", locn_id=" + locn_id
				+ ", locn_brcd=" + locn_brcd + ", grp=" + grp + ", assignedNbrOfUpc=" + assignedNbrOfUpc
				+ ", maxNbrOfSku=" + maxNbrOfSku + ", sopLocationRange=" + sopLocationRange + ", category=" + category
				+ ", length=" + length + ", width=" + width + ", height=" + height + ", createdDttm=" + createdDttm
				+ ", lastUpdatedDttm=" + lastUpdatedDttm + ", createdSource=" + createdSource + ", lastUpdatedSource="
				+ lastUpdatedSource + "]";
	}

}
