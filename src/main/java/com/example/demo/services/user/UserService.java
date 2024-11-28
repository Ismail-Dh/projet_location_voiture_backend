package com.example.demo.services.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserRequest;
@Service
public interface UserService {
    UserDto creerUtilisateur(UserRequest userRequest);
    UserDto modifierUtilisateur(Long id, UserRequest userRequest);
    void supprimerUtilisateur(Long id);
    List<UserDto> getTousUtilisateurs();
    UserDto modifierMotDePasse(Long id, String nouveauMotDePasse);
    UserDto creerUtilisateurSiInexistant(UserRequest userRequest);
}