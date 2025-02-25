package com.pawar.inventory.entity;

public class AssignmentModel {
	private String assignmentId;
	private String sopActionType;
	private String category;

	public AssignmentModel() {
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "AssignmentModel [assignmentId=" + assignmentId + ", sopActionType=" + sopActionType + ", category="
				+ category + "]";
	}

}
