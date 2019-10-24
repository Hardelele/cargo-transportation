package com.hardelele.ct.repositories;

import com.hardelele.ct.models.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<TripEntity,Long> {
}
