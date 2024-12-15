package com.example.demo.services.reservations;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ReservationDto;
import com.example.demo.dto.ReservationRequest;
@Service
public interface ReservationService {
    ReservationDto creerReservation(ReservationRequest reservationRequest);
    ReservationDto modifierReservation(int id, ReservationRequest reservationRequest);
    void supprimerReservation(int id);
    List<ReservationDto> getToutesLesReservations();
    ReservationDto getReservationById(int id);
    long getNombreResrvation();
}