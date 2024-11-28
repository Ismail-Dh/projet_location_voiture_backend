package com.example.demo.services.cars;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CarsDto;
import com.example.demo.dto.CarsRequest;
import com.example.demo.entity.Car;
import com.example.demo.repository.CarsRespository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarsServiceImpl implements CarsService {
	@Autowired
	private  CarsRespository carsRepository;
	@Override
	public CarsDto creerCars(CarsRequest carsRequest) {
		Car car=new Car();
		car.setMarque(carsRequest.getMarque());
		car.setModele(carsRequest.getModele());
		car.setAnnee(carsRequest.getAnnee());
		car.setEtat(carsRequest.getEtat());
		car.setTarif(carsRequest.getTarif());
		car.setType(carsRequest.getType());
		Car creerCar = carsRepository.save(car);
		CarsDto carDto = new CarsDto();
		carDto.setId(creerCar.getId());
		return carDto;
	}
	@Override
    public CarsDto modifierCars(Long id, CarsRequest carsRequest) {
        Car car = carsRepository.findById(id).orElseThrow(() -> new RuntimeException("Voiture introuvable"));
        car.setMarque(carsRequest.getMarque());
        car.setModele(carsRequest.getModele());
        car.setAnnee(carsRequest.getAnnee());
        car.setType(carsRequest.getType());
        car.setTarif(carsRequest.getTarif());
        car.setEtat(carsRequest.getEtat());

        Car updatedCar = carsRepository.save(car);

        CarsDto carsDto = new CarsDto();
        carsDto.setId(updatedCar.getId());
        carsDto.setMarque(updatedCar.getMarque());
        carsDto.setModele(updatedCar.getModele());
        carsDto.setAnnee(updatedCar.getAnnee());
        carsDto.setType(updatedCar.getType());
        carsDto.setTarif(updatedCar.getTarif());
        carsDto.setEtat(updatedCar.getEtat());

        return carsDto;
    }

    @Override
    public void supprimerCars(Long id) {
        carsRepository.deleteById(id);
    }

    @Override
    public List<CarsDto> getTousCars() {
        return carsRepository.findAll().stream().map(car -> {
            CarsDto carsDto = new CarsDto();
            carsDto.setId(car.getId());
            carsDto.setMarque(car.getMarque());
            carsDto.setModele(car.getModele());
            carsDto.setAnnee(car.getAnnee());
            carsDto.setType(car.getType());
            carsDto.setTarif(car.getTarif());
            carsDto.setEtat(car.getEtat());
            return carsDto;
        }).collect(Collectors.toList());
    }

}
