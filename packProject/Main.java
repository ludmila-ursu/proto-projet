package packProject;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
                
		// créer la fiche d'un nouveau secrétaire
		Administratif administratif001 = new Administratif("Armel Cressin", "m", 1990, 1800, "secrétaire");
		Administratif administratif002 = new Administratif("Louis Dubois", "m", 1950, 2100, "bibliothécaire");
		Administratif administratif003 = new Administratif("Dubois Marcus", "m", 1980, 2000, "magasinier");
		Administratif administratif004 = new Administratif("Manuel DaSilva", "m", 1985, 1850, "directeur de CROUS");
		Administratif administratif005 = new Administratif("Alex Nuage", "m", 1990, 2130, "comptable");
		Administratif administratif006 = new Administratif("Claire Annabelle", "f", 1975, 1850,
				"chef d'établissement");
		Administratif administratif007 = new Administratif("Postima Ecouata", "f", 1962, 1900, "secrétaire");
		Administratif administratif008 = new Administratif("Kosmos Ghita", "f", 1990, 1900, "conservatrice");
		Administratif administratif009 = new Administratif("Besonieux Eric", "f", 1992, 1950,
				"adjointe administrative");
		Administratif administratif010 = new Administratif("Carmalia Eva", "f", 1989, 2000,
				"conseillèe d'administration scolaire");

		// instancier les professeurs:
		Professeur professeurs001 = new Professeur("01", "Chevalier Efi", "m", 1993, 2000, "anglais");
		Professeur professeurs002 = new Professeur("02", "Bouton Antoine", "m", 1985, 2000,
				"alorithmique et programmation");
		Professeur professeurs003 = new Professeur("03", "Zeta Emilie", "f", 1963, 2000,
				"atelier de l'informaticien");
		Professeur professeurs004 = new Professeur("04", "Kiwi Jean", "m", 1986, 2000, "programmation fonctionnelle");
		Professeur professeurs005 = new Professeur("05", "Martin Tresse", "m", 1973, 2000, "réseaux");
		Professeur professeurs006 = new Professeur("06", "Poineaut Isabelle", "f", 1984, 2000, "logique");
		Professeur professeurs007 = new Professeur("07", "Duviviez Hélène", "f", 1996, 2000,
				"analyse numérique matricielle");
		Professeur professeurs008 = new Professeur("08", "Besanote Florence", "f", 1986, 2000, "statistiques");
		Professeur professeurs009 = new Professeur("09", "Blois Thierry", "f", 1987, 2000, "algèbre");
		Professeur professeurs010 = new Professeur("10", "Patrice Philippe", "m", 1975, 2000, "modélisation");

		// demander au secrétare de rajouter les professeurs à la liste:
		administratif001.ajoutProfesseurs(professeurs001);
		administratif001.ajoutProfesseurs(professeurs002);
		administratif001.ajoutProfesseurs(professeurs003);
		administratif001.ajoutProfesseurs(professeurs004);
		administratif001.ajoutProfesseurs(professeurs005);
		administratif001.ajoutProfesseurs(professeurs006);
		administratif001.ajoutProfesseurs(professeurs007);
		administratif001.ajoutProfesseurs(professeurs008);
		administratif001.ajoutProfesseurs(professeurs009);
		administratif001.ajoutProfesseurs(professeurs010);
		administratif001.ajoutProfesseurs(professeurs010);

		// demander au secrétaire de faire affichier la liste des professeurs:
		System.out.println();
		System.out.println("Les professeurs présents en base après  rajouts: ");
		for (int i = 0; i < Administratif.professeursList.size(); i++) {
			System.out.println("matricule: " + Administratif.professeursList.get(i).getNombre() + "; Nom, Prénom: "
					+ Administratif.professeursList.get(i).getNom() + "; Sexe: "
					+ Administratif.professeursList.get(i).getSexe() + "; Année Naissance: "
					+ Administratif.professeursList.get(i).getAnneeNaissance() + "; Salaire: "
					+ Administratif.professeursList.get(i).getSalaire() + "; Cours Enseigné: "
					+ Administratif.professeursList.get(i).getCoursEnseigne());
		}

		// demander au secrétaire de supprimer les professeurs de la liste:
		System.out.println();

//		administratif001.supprimerProfesseurs(professeurs001);
//		administratif001.supprimerProfesseurs(professeurs002);
//		administratif001.supprimerProfesseurs(professeurs003);
//		administratif001.supprimerProfesseurs(professeurs004);
//		administratif001.supprimerProfesseurs(professeurs005);
//		administratif001.supprimerProfesseurs(professeurs006);
//		administratif001.supprimerProfesseurs(professeurs007);
//		administratif001.supprimerProfesseurs(professeurs008);
//		administratif001.supprimerProfesseurs(professeurs009);
//		administratif001.supprimerProfesseurs(professeurs010);

		System.out.println();
		//instancier un tableau pour avoir une pyramide des âges:
		ArrayList<Integer> tabPyramideAges= new ArrayList<Integer>();
		for (int i=0; i<Administratif.professeursList.size(); i++){
		tabPyramideAges.add(i, (Integer) 2019-Administratif.professeursList.get(i).getAnneeNaissance());
		}


		System.out.println(tabPyramideAges.size() + " hello tab");
		System.out.println(tabPyramideAges.get(0));
		System.out.println(tabPyramideAges.get(1));
		System.out.println(tabPyramideAges.get(2));
		System.out.println(tabPyramideAges.get(3));
		System.out.println(tabPyramideAges.get(4));
		System.out.println(tabPyramideAges.get(5));
		System.out.println(tabPyramideAges.get(6));
		System.out.println(tabPyramideAges.get(7));
		System.out.println(tabPyramideAges.get(8));
		System.out.println(tabPyramideAges.get(9));


		// demander au secrétaire de faire affichier la liste des professeurs:
		System.out.println();
		System.out.println("Les professeurs restants après suppressions: ");
		for (int i = 0; i < Administratif.professeursList.size(); i++) {
			System.out.println("matricule: " + Administratif.professeursList.get(i).getNombre() + "; Nom, Prénom: "
					+ Administratif.professeursList.get(i).getNom() + "; Sexe: "
					+ Administratif.professeursList.get(i).getSexe() + "; Année Naissance: "
					+ Administratif.professeursList.get(i).getAnneeNaissance() + "; Salaire: "
					+ Administratif.professeursList.get(i).getSalaire() + "; Cours Enseigné: "
					+ Administratif.professeursList.get(i).getCoursEnseigne());
		

		}
		
		// rechercher un/e employé/e en fonction de son matricule:
		administratif001.rechercheEmployee("01");
		
		//rajouter la civilité des professeurs:
		administratif001.civiliteProfesseur(Administratif.professeursList.get(9).getSexe());


	}
}
