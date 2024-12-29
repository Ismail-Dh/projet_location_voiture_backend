package com.example.demo.services.facture;



import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.FactureDto;
import com.example.demo.dto.FactureRequest;
@Service
public interface FactureService {
    List<FactureDto> getAllFactures();
    FactureDto getFactureById(long id);
    FactureDto createFacture(FactureRequest factureRequest);
   // FactureDto createFacture(Long id);

    FactureDto updateFacture(long id, FactureDto factureDTO);
    void deleteFacture(long id);
    
    double getSommeMontantsFactures();
    byte[] generateFacturePDF( FactureDto paiement)throws IOException;
}