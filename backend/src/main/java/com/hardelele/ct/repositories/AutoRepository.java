package com.hardelele.ct.repositories;

import com.hardelele.ct.models.AutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<AutoEntity,Long> {
}
