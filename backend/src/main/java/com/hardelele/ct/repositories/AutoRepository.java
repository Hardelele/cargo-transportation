package com.hardelele.ct.repositories;

import com.hardelele.ct.models.AutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<AutoModel,Integer> {
}
