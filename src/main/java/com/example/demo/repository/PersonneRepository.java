package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
	 Optional<Personne> findByEmail(String email);
}
