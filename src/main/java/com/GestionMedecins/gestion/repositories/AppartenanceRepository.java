package com.GestionMedecins.gestion.repositories;

import com.GestionMedecins.gestion.entities.Appartenance;
import com.GestionMedecins.gestion.entities.Medecin;
import com.GestionMedecins.gestion.entities.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppartenanceRepository extends JpaRepository<Appartenance, Long> {


}
