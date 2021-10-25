package com.eDonationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eDonationSystem.entity.Donations;

public interface DonationsRepository extends JpaRepository<Donations, Long>{

}
