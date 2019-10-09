package com.hardelele.ct.repositories;

import com.hardelele.ct.entities.Way;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WayRepository extends JpaRepository<Way,Long> {

}
