package com.example.demo.dto;

import java.time.LocalDate;

import com.example.demo.entity.Facture;


public class FactureSuppDto {
	 private long id_facture;
	 private Facture facture;
	  private LocalDate date;
	    private String supplementDetails;
	    private Double montantSupp;
		public long getId_facture() {
			return id_facture;
		}
		public void setId_facture(long id_facture) {
			this.id_facture = id_facture;
		}
		public Facture getFacture() {
			return facture;
		}
		public void setFacture(Facture facture) {
			this.facture = facture;
		}
		public String getSupplementDetails() {
			return supplementDetails;
		}
		public void setSupplementDetails(String supplementDetails) {
			this.supplementDetails = supplementDetails;
		}
		public Double getMontantSupp() {
			return montantSupp;
		}
		public void setMontantSupp(Double montantSupp) {
			this.montantSupp = montantSupp;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
	    
}
