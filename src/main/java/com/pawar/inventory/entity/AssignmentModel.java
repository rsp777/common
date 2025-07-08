package com.pawar.inventory.entity;

public class AssignmentModel {
	private String assignmentId;
	private String sopActionType;
	private String batchType;
	private String itemName;
	private int onHandQty;
	private String category;

	public AssignmentModel() {
	}

	public AssignmentModel(String assignmentId, String sopActionType,String batchType, String itemName, int onHandQty, String category) {
		super();
		this.assignmentId = assignmentId;
		this.sopActionType = sopActionType;
		this.batchType = batchType;
		this.itemName = itemName;
		this.onHandQty = onHandQty;
		this.category = category;
	}

	
	
	public AssignmentModel(String assignmentId, String sopActionType, String itemName, String category) {
		super();
		this.assignmentId = assignmentId;
		this.sopActionType = sopActionType;
		this.itemName = itemName;
		this.category = category;
	}

	public AssignmentModel(String sopActionType, String itemName) {
		this.sopActionType = sopActionType;
		this.itemName = itemName;
	}

	
	
	public AssignmentModel(String assignmentId, String sopActionType, String category) {
		this.assignmentId = assignmentId;
		this.sopActionType = sopActionType;
		this.category = category;
	}

	public String getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getSopActionType() {
		return sopActionType;
	}

	public void setSopActionType(String sopActionType) {
		this.sopActionType = sopActionType;
	}
	
	public String getBatchType() {
		return batchType;
	}

	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getOnHandQty() {
		return onHandQty;
	}

	public void setOnHandQty(int onHandQty) {
		this.onHandQty = onHandQty;
	}

	@Override
	public String toString() {
		return "AssignmentModel [assignmentId=" + assignmentId + ", sopActionType=" + sopActionType + ", batchType="
				+ batchType + ", itemName=" + itemName + ", onHandQty=" + onHandQty + ", category=" + category + "]";
	}
}