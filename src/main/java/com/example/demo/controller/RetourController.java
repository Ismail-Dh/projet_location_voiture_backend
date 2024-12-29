package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RetourDto;
import com.example.demo.services.retour.RetourService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/retours")
public class RetourController {
	@Autowired
	private RetourService retourService;
	
	 @GetMapping("/tous")
	 public List<RetourDto> getAllRetour(){
		 return retourService.getAllRetour();
	 }
	 @PostMapping("/creer/{id}")
	 public RetourDto ajouterRetour(@PathVariable Long id) {
		 return retourService.ajouterRetour(id);
	 }
}
