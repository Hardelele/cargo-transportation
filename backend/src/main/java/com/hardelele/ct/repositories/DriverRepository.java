package com.hardelele.ct.repositories;

import com.hardelele.ct.models.DriverModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<DriverModel,Integer> {

}
