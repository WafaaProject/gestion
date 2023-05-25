package com.GestionMedecins.gestion.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Appartenance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApp;

    @ManyToOne
    @JoinColumn(name = "idMedecin")
    Medecin medecin;

    @ManyToOne
    @JoinColumn(name = "idSpecialite")
    Specialite specialite;


}
