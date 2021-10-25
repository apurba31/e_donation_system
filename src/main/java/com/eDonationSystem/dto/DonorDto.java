package com.eDonationSystem.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class DonorDto {

	private Long ngoId;
	@NotNull
	@Length(min = 5, max = 30)
	private String donorName;
	@NotNull
	@Length(min = 5, max = 25)
	private String password;
	@NotNull
    @Length(min = 10, max = 10)
	private Long phoneNumber;
	@NotNull
    @Length(min = 5, max = 100)
	private String address;
	public Long getNgoId() {
		return ngoId;
	}
	public void setNgoId(Long ngoId) {
		this.ngoId = ngoId;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
