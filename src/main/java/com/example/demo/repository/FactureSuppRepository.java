package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FactureSupplementaire;

public interface FactureSuppRepository extends JpaRepository<FactureSupplementaire, Long> {

}
