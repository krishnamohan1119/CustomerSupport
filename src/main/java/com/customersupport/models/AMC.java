package com.customersupport.models;

import java.time.LocalDate;

public class AMC extends CreatableObject {

	private long companyId;
	private String installationNumber;
	private LocalDate amcFrom;
	private LocalDate amcTo;
	private Customer customer;
	private int noOfVisitsPerYear;
	private int agePerVisit;
	private boolean isRenewal;
	private int noOfInstallments;

	/**
	 * @return the companyId
	 */
	public long getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId
	 *            the companyId to set
	 */
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	/**
	 * @return the installationNumber
	 */
	public String getInstallationNumber() {
		return installationNumber;
	}

	/**
	 * @param installationNumber
	 *            the installationNumber to set
	 */
	public void setInstallationNumber(String installationNumber) {
		this.installationNumber = installationNumber;
	}

	/**
	 * @return the amcFrom
	 */
	public LocalDate getAmcFrom() {
		return amcFrom;
	}

	/**
	 * @param amcFrom
	 *            the amcFrom to set
	 */
	public void setAmcFrom(LocalDate amcFrom) {
		this.amcFrom = amcFrom;
	}

	/**
	 * @return the amcTo
	 */
	public LocalDate getAmcTo() {
		return amcTo;
	}

	/**
	 * @param amcTo
	 *            the amcTo to set
	 */
	public void setAmcTo(LocalDate amcTo) {
		this.amcTo = amcTo;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the noOfVisitsPerYear
	 */
	public int getNoOfVisitsPerYear() {
		return noOfVisitsPerYear;
	}

	/**
	 * @param noOfVisitsPerYear
	 *            the noOfVisitsPerYear to set
	 */
	public void setNoOfVisitsPerYear(int noOfVisitsPerYear) {
		this.noOfVisitsPerYear = noOfVisitsPerYear;
	}

	/**
	 * @return the agePerVisit
	 */
	public int getAgePerVisit() {
		return agePerVisit;
	}

	/**
	 * @param agePerVisit
	 *            the agePerVisit to set
	 */
	public void setAgePerVisit(int agePerVisit) {
		this.agePerVisit = agePerVisit;
	}

	/**
	 * @return the isRenewal
	 */
	public boolean isRenewal() {
		return isRenewal;
	}

	/**
	 * @param isRenewal
	 *            the isRenewal to set
	 */
	public void setRenewal(boolean isRenewal) {
		this.isRenewal = isRenewal;
	}

	public int getNoOfInstallments() {
		return noOfInstallments;
	}

	public void setNoOfInstallments(int noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}

}
