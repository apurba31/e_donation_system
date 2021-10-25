package com.eDonationSystem.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class DonationsDto {
	
	private Long donorId;
	@NotNull
	private Long ngoId;
	@NotNull
	@Length(min = 5, max = 100)
	private String donationType;
	@NotNull
	private Long amount;
	public Long getDonorId() {
		return donorId;
	}
	public void setDonorId(Long donorId) {
		this.donorId = donorId;
	}
	public Long getNgoId() {
		return ngoId;
	}
	public void setNgoId(Long ngoId) {
		this.ngoId = ngoId;
	}
	public String getDonationType() {
		return donationType;
	}
	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
}
