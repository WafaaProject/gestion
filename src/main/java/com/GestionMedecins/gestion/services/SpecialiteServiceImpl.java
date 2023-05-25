package com.GestionMedecins.gestion.services;

import com.GestionMedecins.gestion.entities.Medecin;
import com.GestionMedecins.gestion.entities.Specialite;
import com.GestionMedecins.gestion.repositories.MedecinRepository;
import com.GestionMedecins.gestion.repositories.SpecialiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpecialiteServiceImpl implements  SpecialiteService{

    @Autowired
    SpecialiteRepository specialiteRepository;


    @Override
    public Specialite saveSpecialite(Specialite specialite){ return specialiteRepository.save(specialite);}

    @Override
    public Specialite updateSpecialite(Specialite specialite){ return specialiteRepository.save(specialite);}

    @Override
    public Specialite getSpecialiteById(Long id){ return specialiteRepository.findById(id).get();}

    @Override
    public List<Specialite> getAllSpecialites() {
        return specialiteRepository.findAll();
    }


    @Override
    public void deleteSpecialiteById(Long id) {
        specialiteRepository.deleteById(id);
    }


}
