package com.GestionMedecins.gestion;

import com.GestionMedecins.gestion.entities.Appartenance;
import com.GestionMedecins.gestion.entities.Medecin;
import com.GestionMedecins.gestion.entities.Specialite;
import com.GestionMedecins.gestion.repositories.AppartenanceRepository;
import com.GestionMedecins.gestion.repositories.MedecinRepository;
import com.GestionMedecins.gestion.repositories.SpecialiteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;
import java.util.List;


@SpringBootTest
class GestionApplicationTests {

	@Autowired
	MedecinRepository medecinRepository;

	@Autowired
	AppartenanceRepository appartenanceRepository;
	@Autowired
	SpecialiteRepository specialiteRepository;


	@Test
	public void TestCreateMedecin(){
		Medecin medecin = new Medecin(
				"DUCHAUGNE","Paul","3 Rue des Arènes, 40230 Saint-Vincent-de-Tyrosse",
				"Français","2009  Diplôme d'État de docteur en chirurgie dentaire - Université Bordeaux Segalen",
				"2015   C.E.S. laser - Garancière","Lundi : 09h30 - 12h00, 13h30 - 15h30" +
				"Mardi 09h30 - 12h00, 13h30 - 18h00 " +
				"Mercredi 09h00 - 12h00, 13h30 - 15h30 " +
				"Jeudi : 14h00 - 18h00   " +
				"Vendredi : 09h00 - 12h00, 14h00 - 18h00","05 58 77 25 19","En cas d'urgence, contactez le 15 (Samu)"
		);
		medecinRepository.save(medecin);
	}
	/*
	@Test
	public void TestFindMedecinById(){
		Medecin medecin = medecinRepository.findById(1L).get();
		System.out.println(medecin);
	}
    */
	@Test
	public void TestFindAllMedecins(){
		List<Medecin> medecins = medecinRepository.findAll();
		for (Medecin m : medecins){
			System.out.println(m);
		}
		medecins.forEach(System.out::println);
	}
	/*
	@Test
	public void TestDeleteMedecinById(){
		medecinRepository.deleteById(1L);
	}
	*/

	/*
	@Test
	public void testFindMedcinParSpecialite() {
		List<Medecin> medecins = medecinRepository.findMedcinParSpecialite("dentiste");
		for (Medecin medecin : medecins) {
			System.out.println(medecin.getNom());
		}
	}

	 */
/*
	@Test
	public void testFindMedcinParSpecialite() {
		List<Object[]> results = medecinRepository.findMedcinParSpecialite("dentiste");

		for (Object[] result : results) {
			String nomMedecin = (String) result[0];
			String prenomMedecin = (String) result[1];

			System.out.println("Nom Médecin: " + nomMedecin);
			System.out.println("Prénom Médecin: " + prenomMedecin);
			System.out.println("====================");
		}
	}
	*/


	/*@Test
	public void  TestfindSpecialite(){
		List<Specialite> specialites = specialiteRepository.findSpecialite();
		specialites.forEach(System.out::println);
	}*/


	@Test
	public void TestFindSpecialiteMed(){
		System.out.println(specialiteRepository.findNomSpecialiteByMedecinId(1L));
	}

}
