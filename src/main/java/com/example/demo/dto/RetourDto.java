package com.example.demo.dto;

import java.time.LocalDate;

import com.example.demo.entity.Contrat;

import lombok.Data;

@Data
public class RetourDto {
	private long id_retour;
    private Contrat contrat;
    private LocalDate date_retour;
	public long getId_retour() {
		return id_retour;
	}
	public void setId_retour(long id_retour) {
		this.id_retour = id_retour;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public LocalDate getDate_retour() {
		return date_retour;
	}
	public void setDate_retour(LocalDate date_retour) {
		this.date_retour = date_retour;
	}
    
    
}
