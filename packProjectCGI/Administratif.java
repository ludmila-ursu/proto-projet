package packProject;

import java.util.ArrayList;
import java.util.List;

public class Administratif extends Employee {
	String fonction;

	public Administratif(String nom, String sexe, int anneeNaissance, int salaire, String fonction) {
		super(nom, sexe, anneeNaissance, salaire);
		this.nom = nom;
		this.sexe = sexe;
		this.salaire = salaire;
	}

	// instancier une liste pour y rajouter les professeurs:
	public static List<Professeur> professeursList = new ArrayList();

	// rajouter un professeur à la liste de professeurs, tout en vérifiant si le
	// professeur existe déjà, ou pas, dans la liste:
	public void ajoutProfesseurs(Professeur prof) {
		// System.out.println("entrée dans la méthode" + stg);
		if (professeursList.contains(prof)) {
			System.out.println("Le professeur " + prof.getNom() + "(matricule " + prof.getNombre()
					+ "), existe déjà dans la base.");
		} else {
			professeursList.add(prof);
			if (prof.getSexe().equalsIgnoreCase("m")) {
				System.out.println(prof.getNombre() + ")Le professeur " + prof.getNom()
						+ " rajouté à la base (matricule " + prof.getNombre() + ").");
			} else {
				System.out.println(prof.getNombre() + ")La professeure " + prof.getNom()
						+ " rajoutée à la base (matricule " + prof.getNombre() + ").");
			}
		}
	}

	// supprimer un professeur à la liste de professeurs, tout en vérifiant si
	// le professeur existe déjà, ou pas, dans la liste:
	public void supprimerProfesseurs(Professeur ProfASupprimer) {

		for (int i = 0; i < professeursList.size(); i++) {
			Professeur prof = (Professeur) professeursList.get(i);
			if (prof.equals(ProfASupprimer)) {
				professeursList.remove(i);
				if (prof.getSexe().equalsIgnoreCase("m")) {
					System.out.println(prof.getNombre() + ")Le professeur " + prof.getNom()
							+ " a été supprimé de la base (matricule" + prof.getNombre() + ").");
				} else {
					System.out.println(prof.getNombre() + ")La professeure " + prof.getNom()
							+ " a été supprimée de la base (matricule" + prof.getNombre() + ").");
				}
			}

		}
	}

	// méthode pour rechercher un/e professeur/e en fonction de son matricule:
	// (exception)
	public static void rechercheEmployee(String matricule) {
		System.out.println();
		try {
		for (int i = 0; i < professeursList.size(); i++) {
			Professeur prof = professeursList.get(i);
			if (matricule.equals(prof.getNombre())) {
				System.out.println("Résultat de la recherche professeur/e : matricule: " + professeursList.get(i).getNombre() + "; Nom, Prénom: "
						+ professeursList.get(i).getNom() + "; Sexe: "
						+ professeursList.get(i).getSexe() + "; Année Naissance: "
						+ professeursList.get(i).getAnneeNaissance() + "; Salaire: "
						+ professeursList.get(i).getSalaire() + "; Cours Enseigné: "
						+ professeursList.get(i).getCoursEnseigne());
			}}}
			catch(Exception e){
				System.out.println("Résultat de la recherche professeur/e: le professeur avec le matricule" + matricule + "n'existe pas dans la base");
			}
		}

	public static void civiliteProfesseur(String civilite){
	switch(civilite)
	{
	case "m":
	System.out.println("Résultat de la recherche civilité: Monsieur");
	break;
	case "f":
	System.out.println("Résultat de la recherche civilité:Madame");
	break;
	}
	}
	
	public static List<Professeur> getProfesseursList() {
		return professeursList;
	}

	public static void setProfesseursList(List<Professeur> professeursList) {
		Administratif.professeursList = professeursList;
	}

}
