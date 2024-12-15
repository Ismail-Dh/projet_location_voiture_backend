package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
