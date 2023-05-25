package com.GestionMedecins.gestion.services;

import com.GestionMedecins.gestion.entities.Appartenance;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppartenanceService {

    Appartenance saveAppartenance(Appartenance appartenance);
    Appartenance updateAppartenance(Appartenance appartenance);
    Appartenance getAppartenanceById(Long id);
    List<Appartenance> getAllAppartenances();
    void deleteAppartenanceById(Long id);
}
