package com.GestionMedecins.gestion.entities;

import jakarta.persistence.*;
import jakarta.transaction.UserTransaction;

import java.util.List;
import java.util.Set;

@Entity
public class Medecin {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecin;

    private String nom;

    private String prenom;

    private String adresse;
    private String languesParlees;
    private String diplomes;
    private  String autresFormations;
    private String horaireOuverture;
    private String coordonnees;
    private String contactUrgence;

   @OneToMany(mappedBy = "medecin")
    Set<Appartenance> appartenances;



    public Medecin(String nom, String prenom, String adresse, String languesParlees, String diplomes, String autresFormations, String horaireOuverture, String coordonnees, String contactUrgence) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.languesParlees = languesParlees;
        this.diplomes = diplomes;
        this.autresFormations = autresFormations;
        this.horaireOuverture = horaireOuverture;
        this.coordonnees = coordonnees;
        this.contactUrgence = contactUrgence;
    }

    public Medecin() {
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Long getIdMedecin() {
        return idMedecin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


    public String getLanguesParlees() {
        return languesParlees;
    }

    public String getDiplomes() {
        return diplomes;
    }

    public String getAutresFormations() {
        return autresFormations;
    }

    public String getHoraireOuverture() {
        return horaireOuverture;
    }

    public String getCoordonnees() {
        return coordonnees;
    }

    public String getContactUrgence() {
        return contactUrgence;
    }

    public void setIdMedecin(Long idMedecin) {
        this.idMedecin = idMedecin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLanguesParlees(String languesParlees) {
        this.languesParlees = languesParlees;
    }

    public void setDiplomes(String diplomes) {
        this.diplomes = diplomes;
    }

    public void setAutresFormations(String autresFormations) {
        this.autresFormations = autresFormations;
    }

    public void setHoraireOuverture(String horaireOuverture) {
        this.horaireOuverture = horaireOuverture;
    }

    public void setCoordonnees(String coordonnees) {
        this.coordonnees = coordonnees;
    }

    public void setContactUrgence(String contactUrgence) {
        this.contactUrgence = contactUrgence;
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "idMedecin=" + idMedecin +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", languesParlees='" + languesParlees + '\'' +
                ", diplomes='" + diplomes + '\'' +
                ", autresFormations='" + autresFormations + '\'' +
                ", horaireOuverture='" + horaireOuverture + '\'' +
                ", coordonees='" + coordonnees + '\'' +
                ", contactUrgence='" + contactUrgence + '\'' +
                '}';
    }

}
