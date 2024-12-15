package com.example.demo.services.admin;

import org.springframework.stereotype.Service;

import com.example.demo.dto.AdminDto;
import com.example.demo.dto.UserRequest;

@Service
public interface AdminService {
    AdminDto modifierMotDePasseAvecVerification(Long id, String ancienMotDePasse, String nouveauMotDePasse);
    AdminDto modifierUtilisateur(Long id, UserRequest userRequest);
}
