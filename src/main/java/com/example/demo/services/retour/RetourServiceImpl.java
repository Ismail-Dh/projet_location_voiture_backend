package com.example.demo.services.retour;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RetourDto;
import com.example.demo.entity.Car;
import com.example.demo.entity.Contrat;
import com.example.demo.entity.Reservation;
import com.example.demo.entity.Retour;
import com.example.demo.repository.CarsRespository;
import com.example.demo.repository.ContratRepository;
import com.example.demo.repository.ReservationRepository;
import com.example.demo.repository.RetourRepository;
@Service
public class RetourServiceImpl implements RetourService {
	@Autowired
    private RetourRepository retourRepository;
	@Autowired
    private ContratRepository contratRepository;
	@Autowired
    private ReservationRepository reservationRepository;
	@Autowired
    private CarsRespository carsRespository;
	@Override
	public List<RetourDto> getAllRetour() {
		
		return retourRepository.findAll().stream()
                .map(this::convertDto)
                .collect(Collectors.toList());
	}

	@Override
	public RetourDto ajouterRetour(Long id_contrat,Boolean etat) {
		Contrat contrat= contratRepository.findById(id_contrat).orElseThrow(() -> new RuntimeException("Contrat not found"));
		Retour retour = new Retour();
		retour.setContrat(contrat);
		retour.setDate_retour(LocalDate.now());
		retour.setEtat_voitureBoolean(etat);
		retourRepository.save(retour);
		if(contrat.getReservation().getStatu()=="En litige") {
			contrat.setEtat("Clos avec retard");
			contratRepository.save(contrat);
		}else {
			contrat.setEtat("Clos");
			contratRepository.save(contrat);
		}
		Reservation reservation = contrat.getReservation();
		reservation.setStatu("Termine");
		Car car =contrat.getReservation().getCar();
		car.setEtat("Disponible");
		carsRespository.save(car);
		reservationRepository.save(reservation);
		return convertDto(retour);
	}
    private RetourDto convertDto(Retour retour) {
    	RetourDto retourDto=new RetourDto();
    	retourDto.setId_retour(retour.getId_retour());
    	retourDto.setContrat(retour.getContrat());
    	retourDto.setDate_retour(retour.getDate_retour());
    	retourDto.setEtat_voitureBoolean(retour.getEtat_voitureBoolean());
    	return retourDto;
    }
}
