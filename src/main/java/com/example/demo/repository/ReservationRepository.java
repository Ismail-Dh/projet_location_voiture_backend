package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	 @Query("SELECT COUNT(r) FROM Reservation r WHERE r.user.id = :clientId")
	    long countByClientId(@Param("clientId") Long clientId);
	 @Query("SELECT COUNT(r) FROM Reservation r WHERE r.user.id = :clientId and r.statu = :statu")
	    long countByClientIdAndStatu(@Param("clientId") Long clientId,@Param("statu") String statu);
}
