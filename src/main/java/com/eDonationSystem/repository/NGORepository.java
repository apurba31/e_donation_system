package com.eDonationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eDonationSystem.entity.NGO;

public interface NGORepository extends JpaRepository<NGO, Long>{
	
}
