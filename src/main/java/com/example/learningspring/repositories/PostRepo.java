package com.example.learningspring.repositories;

import com.example.learningspring.models.Ad;
import com.example.learningspring.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {

}
