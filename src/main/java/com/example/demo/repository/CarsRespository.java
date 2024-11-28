package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Car;

public interface CarsRespository extends JpaRepository<Car, Long> {

}
