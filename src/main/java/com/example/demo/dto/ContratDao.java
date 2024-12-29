package com.example.demo.dto;

import com.example.demo.entity.Reservation;

public class ContratDao {
    private Long idContrat;
    private Reservation reservation;
    private String etat;
	public Long getIdContrat() {
		return idContrat;
	}
	public void setIdContrat(Long idContrat) {
		this.idContrat = idContrat;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
    
}
