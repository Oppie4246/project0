package com.qa.project.persistence.repo;

import com.qa.project.persistence.domain.BookingDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository <BookingDomain, Long> {
}
