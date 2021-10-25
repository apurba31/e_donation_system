package com.eDonationSystem.service;

import com.eDonationSystem.dto.DonorDto;
import com.eDonationSystem.entity.Donor;

public interface DonorService {
	
	public DonorDto registerDonor(Donor donor); 
	public DonorDto getAllDonor(Donor donor);
	public DonorDto updateDonorDetails(Donor donor);

}
