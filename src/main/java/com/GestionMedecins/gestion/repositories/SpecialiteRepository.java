package com.GestionMedecins.gestion.repositories;


import com.GestionMedecins.gestion.entities.Medecin;
import com.GestionMedecins.gestion.entities.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface SpecialiteRepository extends JpaRepository<Specialite, Long> {

    @Query("SELECT s.nomSpecialite FROM Specialite s JOIN s.appartenances a JOIN a.medecin m WHERE m.idMedecin = :idMedecin")
    String findNomSpecialiteByMedecinId(@Param("idMedecin") Long idMedecin);

}
