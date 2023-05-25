package com.GestionMedecins.gestion.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Specialite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSpecialite;
    private String nomSpecialite;

    @OneToMany (mappedBy = "specialite")
    Set<Appartenance> appartenances;

    public Specialite() {
    }

    public Specialite(Long idSpecialite, String nomSpecialite) {
        this.idSpecialite = idSpecialite;
        this.nomSpecialite = nomSpecialite;
    }

    public Long getIdSpecialite() {
        return idSpecialite;
    }

    public String getNomSpecialite() {
        return nomSpecialite;
    }

    public void setIdSpecialite(Long idSpecialite) {
        this.idSpecialite = idSpecialite;
    }

    public void setNomSpecialite(String nomSpecialite) {
        this.nomSpecialite = nomSpecialite;
    }

    @Override
    public String toString() {
        return "Specialite{" +
                "idSpecialite=" + idSpecialite +
                ", nomSpecialite='" + nomSpecialite + '\'' +
                '}';
    }


}
