package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "retour")
public class Retour {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id_retour;

	    @OneToOne
	    @JoinColumn(name = "id_contrat", nullable = false)
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
