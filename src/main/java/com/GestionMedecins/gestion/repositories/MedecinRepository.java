package com.GestionMedecins.gestion.repositories;

import com.GestionMedecins.gestion.entities.Appartenance;
import com.GestionMedecins.gestion.entities.Medecin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {

   /*
   @Query(value = "SELECT medecin.nom, medecin.prenom " +
           "FROM appartenance appartenance, medecin medecin, specialite specialite " +
           "WHERE appartenance.id_medecin = medecin.id_medecin " +
           "AND specialite.id_specialite = appartenance.id_specialite " +
           "AND specialite.nom_specialite = :nomSpecialite", nativeQuery = true)
   List<Object[]> findMedecinsBySpecialite(@Param("nomSpecialite") String nomSpecialite);

    */
   @Query(value = "SELECT medecin.nom, medecin.prenom " +
           "FROM appartenance appartenance, medecin medecin, specialite specialite " +
           "WHERE appartenance.id_medecin = medecin.id_medecin " +
           "AND specialite.id_specialite = appartenance.id_specialite " +
           "AND specialite.nom_specialite = :nomSpecialite", nativeQuery = true)
   Page<Medecin> findMedcinParSpecialite(@Param("nomSpecialite") String nomSpecialite, Pageable pageable);




}
