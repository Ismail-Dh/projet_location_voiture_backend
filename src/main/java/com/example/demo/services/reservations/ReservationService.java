package com.example.demo.services.reservations;



import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ReservationDto;
import com.example.demo.dto.ReservationRequest;
@Service
public interface ReservationService {
    ReservationDto creerReservation(ReservationRequest reservationRequest);
    ReservationDto modifierReservation(Long id, ReservationRequest reservationRequest);
    ReservationDto confirmerReservation(Long id);
    void supprimerReservation(int id);
    List<ReservationDto> getToutesLesReservations();
    ReservationDto getReservationById(Long id);
    long getNombreResrvation();
    long getNombreResrvationDuClient(Long id);
    long getNombreResrvationDuClientAndStatu(Long id,String statu);
    Double montontTotal(Long id);
    @Scheduled(cron = "* * * * * ?")
    void mettreAJourStatutReservations();
    void annulerReservation(Long id);
    List<ReservationDto> getToutesLesReservationsDuClient(Long id_client);
}