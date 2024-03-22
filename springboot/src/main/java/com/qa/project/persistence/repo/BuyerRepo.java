package com.qa.project.persistence.repo;

import com.qa.project.persistence.domain.BuyerDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepo extends JpaRepository<BuyerDomain, Integer> {
}
