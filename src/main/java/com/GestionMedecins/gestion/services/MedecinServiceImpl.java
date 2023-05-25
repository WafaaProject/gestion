package com.GestionMedecins.gestion.services;

import com.GestionMedecins.gestion.entities.Medecin;
import com.GestionMedecins.gestion.repositories.MedecinRepository;
import com.GestionMedecins.gestion.repositories.SpecialiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedecinServiceImpl implements MedecinService{

    @Autowired
    MedecinRepository medecinRepository;

    @Autowired
    private SpecialiteRepository specialiteRepository;
    @Override
    public Medecin saveMedecin(Medecin medecin){ return medecinRepository.save(medecin);}

    @Override
    public Medecin updateMedecin(Medecin medecin){ return medecinRepository.save(medecin);}

    @Override
    public Medecin getMedecinById(Long id){ return medecinRepository.findById(id).get();}

    @Override
    public List<Medecin> getAllMedecins() {
        return medecinRepository.findAll();
    }


    @Override
    public void deleteMedecinById(Long id) {
        medecinRepository.deleteById(id);
    }

    @Override
    public Page<Medecin> getAllMedecinsByPage(int page, int size) {
        return medecinRepository.findAll(PageRequest.of(page, size));
    }
    public Page<Medecin> getMedecinsBySpecialite(String specialite, Pageable pageable) {
        return medecinRepository.findMedcinParSpecialite(specialite, pageable);
    }
    public String getSpecialiteByMedecinId(Long medecinId) {
        return specialiteRepository.findNomSpecialiteByMedecinId(medecinId);
    }


}
