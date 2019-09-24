package com.hardelele.ct.repositories;

import com.hardelele.ct.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {

}
