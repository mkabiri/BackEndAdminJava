package com.labausegtic.aresvi.repository;

import com.labausegtic.aresvi.domain.Recommendation;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Recommendation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {

}