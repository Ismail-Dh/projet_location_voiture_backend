package com.example.demo.services.cars;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CarsDto;
import com.example.demo.dto.CarsRequest;
import com.example.demo.entity.Car;
@Service
public interface CarsService {
	// Méthode pour créer une voiture
	CarsDto creerCars(CarsRequest carsRequest);
	
	CarsDto modifierCars(Long id, CarsRequest carsRequest);
    
	void supprimerCars(Long id);
    Long getNombreCars();
    List<CarsDto> getTousCars();
    
 // Méthode pour récupérer une voiture par ID
    CarsDto getCarsById(Long id);
    
    List<CarsDto> searchCars(String type, String marque, Double tarif);
}
