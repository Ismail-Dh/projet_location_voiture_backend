package com.example.demo.services.retour;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.RetourDto;
@Service
public interface RetourService {
          List<RetourDto> getAllRetour();
          RetourDto ajouterRetour(Long id_contrat);
          
}
