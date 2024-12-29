package com.example.demo.services.contrat;


import java.util.List;

import com.example.demo.dto.ContratDao;


public interface ContratsService {
       List<ContratDao> getAllContrats();
       ContratDao getContratById(Long id);
       ContratDao getContratByIdReservation(Long id);
       ContratDao createContrat(Long id);
       void supprimer(Long id);
       byte[] generateContratPDFWithSignature(ContratDao contrat,byte[] signatureImage)throws Exception;
       void sendContratEmail(String recipientEmail, String subject, String body, byte[] contratPdf) throws Exception;
}
