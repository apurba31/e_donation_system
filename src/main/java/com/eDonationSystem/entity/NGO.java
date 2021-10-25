package com.eDonationSystem.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="ngo")
public class NGO {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long ngoId;
	 
	 private String ngoName;
	 @NotNull
	 @Length(min = 5, max = 30)
	 private String username;
	 @NotNull
	 @Length(min = 5, max = 25)
	 private String password;
	 @NotNull
	 @Length(min = 5, max = 30)
	 @Email(message = "Email should be valid")
	 private String emailAddress;
	 @NotNull
	 @Length(min = 10, max = 10)
	 private Long phoneNumber;
	 @Past
	 private Date establishedDate;
	 
		public Long getNgoId() {
			return ngoId;
		}
		public void setNgoId(Long ngoId) {
			this.ngoId = ngoId;
		}
		public String getNgoName() {
			return ngoName;
		}
		public void setNgoName(String ngoName) {
			this.ngoName = ngoName;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		public Long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public Date getEstablishedDate() {
			return establishedDate;
		}
		public void setEstablishedDate(Date establishedDate) {
			this.establishedDate = establishedDate;
		}
	 
	 

}
