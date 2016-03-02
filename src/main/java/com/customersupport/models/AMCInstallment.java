package com.customersupport.models;

import java.time.LocalDate;

public class AMCInstallment extends CreatableObject {

	private AMC amc;
	private int installmentNumber;
	private double installmentAmount;
	private int status;
	private LocalDate paidDate;
	private LocalDate dueDate;

	/**
	 * @return the amc
	 */
	public AMC getAmc() {
		return amc;
	}

	/**
	 * @param amc
	 *            the amc to set
	 */
	public void setAmc(AMC amc) {
		this.amc = amc;
	}

	/**
	 * @return the installmentNumber
	 */
	public int getInstallmentNumber() {
		return installmentNumber;
	}

	/**
	 * @param installmentNumber
	 *            the installmentNumber to set
	 */
	public void setInstallmentNumber(int installmentNumber) {
		this.installmentNumber = installmentNumber;
	}

	/**
	 * @return the installmentAmount
	 */
	public double getInstallmentAmount() {
		return installmentAmount;
	}

	/**
	 * @param installmentAmount
	 *            the installmentAmount to set
	 */
	public void setInstallmentAmount(double installmentAmount) {
		this.installmentAmount = installmentAmount;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the paidDate
	 */
	public LocalDate getPaidDate() {
		return paidDate;
	}

	/**
	 * @param paidDate
	 *            the paidDate to set
	 */
	public void setPaidDate(LocalDate paidDate) {
		this.paidDate = paidDate;
	}

	/**
	 * @return the dueDate
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate
	 *            the dueDate to set
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
}
