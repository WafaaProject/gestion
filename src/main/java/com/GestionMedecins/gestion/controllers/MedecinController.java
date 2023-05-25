package com.GestionMedecins.gestion.controllers;

import com.GestionMedecins.gestion.entities.Medecin;
import com.GestionMedecins.gestion.entities.Specialite;
import com.GestionMedecins.gestion.repositories.MedecinRepository;
import com.GestionMedecins.gestion.repositories.SpecialiteRepository;
import com.GestionMedecins.gestion.services.MedecinService;
import com.GestionMedecins.gestion.services.SpecialiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MedecinController {

    @Autowired
    MedecinService medecinService;

    @Autowired
    SpecialiteService specialiteService;

    @Autowired
    MedecinRepository medecinRepository;

    @Autowired
    SpecialiteRepository specialiteRepository;




    @RequestMapping("/medecinsList")
    public String medecinsList(ModelMap modelMap,
                               @RequestParam(name = "specialite", required = false) String specialite,
                               @RequestParam(name = "page", defaultValue = "0") int page ,
                               @RequestParam(name = "size", defaultValue = "2") int size){
        Page<Medecin> medecinsController;
        if (specialite != null) {
            medecinsController = medecinService.getMedecinsBySpecialite(specialite, PageRequest.of(page, size));
        } else {
            medecinsController = medecinService.getAllMedecinsByPage(page, size);
        }

        modelMap.addAttribute("medecinsJsp", medecinsController.getContent());
        List<Specialite> specialitesController = specialiteService.getAllSpecialites();
        modelMap.addAttribute("specialiteJsp", specialitesController);
        modelMap.addAttribute("medecinsJsp", medecinsController);

        modelMap.addAttribute("pages", new int[medecinsController.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);


        /*
        Page<Medecin> medecinsController = medecinService.getAllMedecinsByPage(page, size);
        modelMap.addAttribute("medecinsJsp", medecinsController);
        List<Specialite> specialitesController = specialiteService.getAllSpecialites();
        modelMap.addAttribute("specialiteJsp", specialitesController);
        modelMap.addAttribute("pages", new int[medecinsController.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);

         */

        return "MedecinsList";
    }

    @RequestMapping("/showMedecin")
    public String showMedecin(@RequestParam("id") Long id, ModelMap modelMap){
        Medecin medecinsController = medecinService.getMedecinById(id);
        modelMap.addAttribute("medecinsJsp", medecinsController);
        String nomSpecialite = specialiteRepository.findNomSpecialiteByMedecinId(id);
        modelMap.addAttribute("nomSpecialite", nomSpecialite);
        return "MedecinDetails";
    }



}
