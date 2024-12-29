package com.example.demo.controller;


import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.ReservationDto;
import com.example.demo.dto.ReservationRequest;
import com.example.demo.services.reservations.ReservationService;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/reservations")
@RequiredArgsConstructor
public class ReservationController {
	@Autowired
    private  ReservationService reservationService;

    // Créer une nouvelle réservation
    @PostMapping("/creer")
    public ResponseEntity<ReservationDto> createReservation(@RequestBody ReservationRequest reservationRequest) {
        ReservationDto createdReservation = reservationService.creerReservation(reservationRequest);
        return ResponseEntity.ok(createdReservation);
    }

    // Modifier une réservation existante
    @PutMapping("/modifier/{id}")
    public ResponseEntity<ReservationDto> updateReservation(@PathVariable int id, @RequestBody ReservationRequest reservationRequest) {
        ReservationDto updatedReservation = reservationService.modifierReservation(id, reservationRequest);
        return ResponseEntity.ok(updatedReservation);
    }
    @PutMapping("/confirmer/{id}")
    public ResponseEntity<ReservationDto> confirmerReservation(@PathVariable int id) {
        ReservationDto updatedReservation = reservationService.confirmerReservation(id);
        return ResponseEntity.ok(updatedReservation);
    }
    
    @GetMapping("/montant-total/{id}")
    public ResponseEntity<Double> getMontantTotal(@PathVariable Long id) {
        try {
            Double montantTotal = reservationService.montontTotal(id);
            return ResponseEntity.ok(montantTotal);
        } catch (RuntimeException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    // Supprimer une réservation par ID
    @DeleteMapping("/supprimer/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable int id) {
        reservationService.supprimerReservation(id);
        return ResponseEntity.noContent().build();
    }

    // Obtenir toutes les réservations
    @GetMapping("/toutes")
    public ResponseEntity<List<ReservationDto>> getAllReservations() {
        List<ReservationDto> reservations = reservationService.getToutesLesReservations();
        return ResponseEntity.ok(reservations);
    }

    // Obtenir une réservation par ID
    @GetMapping("/{id}")
    public ResponseEntity<ReservationDto> getReservationById(@PathVariable int id) {
        ReservationDto reservation = reservationService.getReservationById(id);
        return ResponseEntity.ok(reservation);
    }
    @GetMapping("/count")
    public long getNombreReservations() {
        return reservationService.getNombreResrvation();
    }
    @GetMapping("/countReservationClient/{id}")
    public long getNombreResrvationDuClient(@PathVariable Long id) {
        return reservationService.getNombreResrvationDuClient(id);
    }
    @GetMapping("/countReservationClientStatu/{id}/{statu}")
    public long getNombreResrvationDuClientAndstatu(@PathVariable Long id,@PathVariable String statu) {
        return reservationService.getNombreResrvationDuClientAndStatu(id, statu);
    }
}