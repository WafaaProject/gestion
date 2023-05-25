package com.GestionMedecins.gestion.services;

import com.GestionMedecins.gestion.entities.Appartenance;
import com.GestionMedecins.gestion.repositories.AppartenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppartenanceServiceImpl  implements AppartenanceService{


    @Autowired
    AppartenanceRepository appartenanceRepository;


    @Override
    public Appartenance saveAppartenance(Appartenance appartenance){ return appartenanceRepository.save(appartenance);}

    @Override
    public Appartenance updateAppartenance(Appartenance appartenance){ return appartenanceRepository.save(appartenance);}

    @Override
    public Appartenance getAppartenanceById(Long id){ return appartenanceRepository.findById(id).get();}

    @Override
    public List<Appartenance> getAllAppartenances() {
        return appartenanceRepository.findAll();
    }


    @Override
    public void deleteAppartenanceById(Long id) {
        appartenanceRepository.deleteById(id);
    }

}
