package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepository extends JpaRepository<Recommendation,Long> {
}
