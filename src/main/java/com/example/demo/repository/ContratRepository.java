package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
	 @Query("SELECT c FROM Contrat c WHERE c.reservation.id_resrvation = :reservationId")
	    Contrat contratByreservationId(@Param("reservationId") Long reservationId);
}
