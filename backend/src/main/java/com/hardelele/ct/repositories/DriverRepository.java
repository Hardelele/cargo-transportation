package com.hardelele.ct.repositories;

import com.hardelele.ct.models.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<DriverEntity,Long> {

}
