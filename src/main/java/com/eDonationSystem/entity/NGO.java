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

}
