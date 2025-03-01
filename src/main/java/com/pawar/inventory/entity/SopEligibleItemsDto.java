package com.pawar.inventory.entity;

import java.time.LocalDateTime;

public class SopEligibleItemsDto {

	private Integer sopEligibleItemsId;
	private int item_id;
	private String item_brcd;
	private String asnBrcd;
	private String asnLpnInfo;
	private String locnInfo;
	private int asnInTranQty;
	private int asnRcvQty;
	private int resvQty;
	private String category;
	private float length;
	private float width;
	private float height;
	private String isAssigned;
	private LocalDateTime createdDttm;
	private LocalDateTime lastUpdatedDttm;
	private String createdSource;
	private String lastUpdatedSource;

	public SopEligibleItemsDto() {
	}

	public SopEligibleItemsDto(Integer sopEligibleItemsId, int item_id, String item_brcd, String asnBrcd,
			String asnLpnInfo, String locnInfo, int asnInTranQty, int asnRcvQty, int resvQty, String category,
			float length, float width, float height, String isAssigned, LocalDateTime createdDttm,
			LocalDateTime lastUpdatedDttm, String createdSource, String lastUpdatedSource) {
		this.sopEligibleItemsId = sopEligibleItemsId;
		this.item_id = item_id;
		this.item_brcd = item_brcd;
		this.asnBrcd = asnBrcd;
		this.asnLpnInfo = asnLpnInfo;
		this.locnInfo = locnInfo;
		this.asnInTranQty = asnInTranQty;
		this.asnRcvQty = asnRcvQty;
		this.resvQty = resvQty;
		this.category = category;
		this.length = length;
		this.width = width;
		this.height = height;
		this.isAssigned = isAssigned;
		this.createdDttm = createdDttm;
		this.lastUpdatedDttm = lastUpdatedDttm;
		this.createdSource = createdSource;
		this.lastUpdatedSource = lastUpdatedSource;
	}

	public Integer getSopEligibleItemsId() {
		return sopEligibleItemsId;
	}

	public void setSopEligibleItemsId(Integer sopEligibleItemsId) {
		this.sopEligibleItemsId = sopEligibleItemsId;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_brcd() {
		return item_brcd;
	}

	public void setItem_brcd(String item_brcd) {
		this.item_brcd = item_brcd;
	}

	public String getAsnBrcd() {
		return asnBrcd;
	}

	public void setAsnBrcd(String asnBrcd) {
		this.asnBrcd = asnBrcd;
	}

	public String getAsnLpnInfo() {
		return asnLpnInfo;
	}

	public void setAsnLpnInfo(String asnLpnInfo) {
		this.asnLpnInfo = asnLpnInfo;
	}

	public String getLocnInfo() {
		return locnInfo;
	}

	public void setLocnInfo(String locnInfo) {
		this.locnInfo = locnInfo;
	}

	public int getAsnInTranQty() {
		return asnInTranQty;
	}

	public void setAsnInTranQty(int asnInTranQty) {
		this.asnInTranQty = asnInTranQty;
	}

	public int getAsnRcvQty() {
		return asnRcvQty;
	}

	public void setAsnRcvQty(int asnRcvQty) {
		this.asnRcvQty = asnRcvQty;
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

	public String getIsAssigned() {
		return isAssigned;
	}

	public void setIsAssigned(String isAssigned) {
		this.isAssigned = isAssigned;
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
		return "SopEligibleItemsDto [sopEligibleItemsId=" + sopEligibleItemsId + ", item_id=" + item_id + ", item_brcd="
				+ item_brcd + ", asnBrcd=" + asnBrcd + ", asnLpnInfo=" + asnLpnInfo + ", locnInfo=" + locnInfo
				+ ", asnInTranQty=" + asnInTranQty + ", asnRcvQty=" + asnRcvQty + ", resvQty=" + resvQty + ", category="
				+ category + ", length=" + length + ", width=" + width + ", height=" + height + ", isAssigned="
				+ isAssigned + ", createdDttm=" + createdDttm + ", lastUpdatedDttm=" + lastUpdatedDttm
				+ ", createdSource=" + createdSource + ", lastUpdatedSource=" + lastUpdatedSource + "]";
	}

}
