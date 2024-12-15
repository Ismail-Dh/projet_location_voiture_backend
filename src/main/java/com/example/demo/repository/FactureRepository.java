package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long> {
	 @Query("SELECT SUM(f.montant) FROM Facture f")
	    Double sumMontants();
}
