package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "faactureSupplementaire")
public class FactureSupplementaire  {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id_facturesup;
	 
	 private String supplementDetails;
     private Double montantSupp;
     @ManyToOne
     private Facture facture;
	 
     private LocalDate date;

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

		
		public long getId_facturesup() {
			return id_facturesup;
		}

		public void setId_facturesup(long id_facturesup) {
			this.id_facturesup = id_facturesup;
		}

		public Facture getFacture() {
			return facture;
		}

		public void setFacture(Facture facture) {
			this.facture = facture;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		
	    
	    

}
