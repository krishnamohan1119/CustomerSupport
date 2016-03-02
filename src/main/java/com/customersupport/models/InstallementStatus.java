package com.customersupport.models;

public enum InstallementStatus {
	PAID("Paid"), DUE("Due");
	private String status;

	InstallementStatus(String status) {
		this.status = status;
	}

	public String toString() {
		return status;
	}
}
