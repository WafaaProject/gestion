package com.GestionMedecins.gestion.services;

import com.GestionMedecins.gestion.entities.Medecin;
import com.GestionMedecins.gestion.entities.Specialite;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpecialiteService {

    Specialite saveSpecialite(Specialite specialite);
    Specialite updateSpecialite(Specialite specialite);
    Specialite getSpecialiteById(Long id);
    List<Specialite> getAllSpecialites();
    void deleteSpecialiteById(Long id);
}
