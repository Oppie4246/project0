package com.qa.project.persistence.repo;

import com.qa.project.persistence.domain.PropertyDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepo extends JpaRepository<PropertyDomain, Long> {
}