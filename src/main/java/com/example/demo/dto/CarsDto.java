package com.example.demo.dto;

import lombok.Data;

@Data
public class CarsDto {
private Long id;
	
	private String marque;
	
	private Integer modele;
	
	private Integer annee;
	
	private String type;
	
	private Double tarif;
	
	private String etat;

	public CarsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Integer getModele() {
		return modele;
	}

	public void setModele(Integer modele) {
		this.modele = modele;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getTarif() {
		return tarif;
	}

	public void setTarif(Double tarif) {
		this.tarif = tarif;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	
}
