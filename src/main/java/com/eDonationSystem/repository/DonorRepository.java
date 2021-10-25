package com.eDonationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eDonationSystem.entity.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long>{

}
