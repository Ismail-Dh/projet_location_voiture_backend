package com.example.demo.dto;




import lombok.Data;

import java.util.Date;

import com.example.demo.entity.Car;
import com.example.demo.entity.User;

@Data
public class ReservationDto {
    private Long id_reservation;
    private Date date_debut;
    private Date date_fin;
    private Date date_de_reservation;
    private String statu;
    private Car car;    // Objet de la voiture
    private User user;  // Objet de l'utilisateur
	
    
	public Long getId_reservation() {
		return id_reservation;
	}
	public void setId_reservation(Long id_reservation) {
		this.id_reservation = id_reservation;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate_de_reservation() {
		return date_de_reservation;
	}
	public void setDate_de_reservation(Date date_de_reservation) {
		this.date_de_reservation = date_de_reservation;
	}
    
    
}