package com.GestionMedecins.gestion.services;

import com.GestionMedecins.gestion.entities.Medecin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MedecinService {

    Medecin saveMedecin(Medecin medecin);
    Medecin updateMedecin(Medecin medecin);
    Medecin getMedecinById(Long id);
    List<Medecin> getAllMedecins();
    void deleteMedecinById(Long id);
    Page<Medecin> getAllMedecinsByPage(int page, int size);
    Page<Medecin> getMedecinsBySpecialite(String specialite, Pageable pageable);

    String getSpecialiteByMedecinId(Long medecinId) ;


}
