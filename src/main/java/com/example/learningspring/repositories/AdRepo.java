package com.example.learningspring.repositories;

import com.example.learningspring.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdRepo extends JpaRepository<Ad, Long> {

}
