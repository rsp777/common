package com.pawar.inventory.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ASNDto {
	
	@JsonIgnore
	private Integer id;
	private String asnBrcd;
	private List<LpnDto> lpns;
	private Integer totalQuantity;
	private Integer asnStatus;
	private LocalDateTime created_dttm;
	private LocalDateTime last_updated_dttm;
	private String created_source;
	private String last_updated_source;
	
	public ASNDto() {
	}

	public ASNDto(Integer id, String asnBrcd, List<LpnDto> lpns, Integer totalQuantity, Integer asnStatus,
			LocalDateTime created_dttm, LocalDateTime last_updated_dttm, String created_source,
			String last_updated_source) {
		super();
		this.id = id;
		this.asnBrcd = asnBrcd;
		this.lpns = lpns;
		this.totalQuantity = totalQuantity;
		this.asnStatus = asnStatus;
		this.created_dttm = created_dttm;
		this.last_updated_dttm = last_updated_dttm;
		this.created_source = created_source;
		this.last_updated_source = last_updated_source;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAsnBrcd() {
		return asnBrcd;
	}

	public void setAsnBrcd(String asnBrcd) {
		this.asnBrcd = asnBrcd;
	}

	public List<LpnDto> getLpns() {
		return lpns;
	}

	public void setLpns(List<LpnDto> lpns) {
		this.lpns = lpns;
	}

	public Integer getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public Integer getAsnStatus() {
		return asnStatus;
	}

	public void setAsnStatus(Integer asnStatus) {
		this.asnStatus = asnStatus;
	}

	public LocalDateTime getCreated_dttm() {
		return created_dttm;
	}

	public void setCreated_dttm(LocalDateTime created_dttm) {
		this.created_dttm = created_dttm;
	}

	public LocalDateTime getLast_updated_dttm() {
		return last_updated_dttm;
	}

	public void setLast_updated_dttm(LocalDateTime last_updated_dttm) {
		this.last_updated_dttm = last_updated_dttm;
	}

	public String getCreated_source() {
		return created_source;
	}

	public void setCreated_source(String created_source) {
		this.created_source = created_source;
	}

	public String getLast_updated_source() {
		return last_updated_source;
	}

	public void setLast_updated_source(String last_updated_source) {
		this.last_updated_source = last_updated_source;
	}

	@Override
	public String toString() {
		return "ASNDto [id=" + id + ", asnBrcd=" + asnBrcd + ", lpns=" + lpns + ", totalQuantity=" + totalQuantity
				+ ", asnStatus=" + asnStatus + ", created_dttm=" + created_dttm + ", last_updated_dttm=" + last_updated_dttm
				+ ", created_source=" + created_source + ", last_updated_source=" + last_updated_source + "]";
	}
}
