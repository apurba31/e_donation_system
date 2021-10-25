package com.eDonationSystem.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eDonationSystem.dto.DonorDto;
import com.eDonationSystem.entity.Donor;
import com.eDonationSystem.repository.DonorRepository;
import com.eDonationSystem.service.DonorService;

@Service
public class DonorServiceImpl implements DonorService{
	
	@Autowired
	DonorRepository repository;

	@Override
	public DonorDto registerDonor(Donor donor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DonorDto getAllDonor(Donor donor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DonorDto updateDonorDetails(Donor donor) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public DonorDto registerDonor(DonorDto donorDto) {
//		Donor donor = new Donor();
//		BeanUtils.copyProperties(donor, donorDto);
//		repository.save(donor);
//		return donorDto;
//	}
//	
//	public DonorDto donateForNGO(DonorDto donorDto) {
//		Donor donor = new Donor();
//		BeanUtils.copyProperties(donor, donorDto);
//		repository.save(donor);
//		return donorDto;
//	}


}
