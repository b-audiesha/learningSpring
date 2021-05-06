package com.example.learningspring.repositories;

import com.example.learningspring.models.AdDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdDetailsRepo extends JpaRepository<AdDetails, Long> {
}
