package packProject;

import java.util.ArrayList;
import java.util.List;

public class Service {

	public static List<Professor> professorList = new ArrayList<>();
	public static List<Professor> getProfessorList() {
		return professorList;
	}

	public static void setProfessorList(List<Professor> professorList) {
		Service.professorList = professorList;
	}
	
	// add professor(s)
	public void addProfessor(Professor prof) {
		if (professorList.contains(prof)) {
			System.out.println("Le professeur " + prof.getName() + "(matricule " + prof.getId()
					+ "), existe déjà dans la base.");
		} else {
			professorList.add(prof);
			if (prof.getGender().equalsIgnoreCase("m")) {
				System.out.println(prof.getId() + ")Le professeur " + prof.getName()
						+ " rajouté à la base (matricule " + prof.getId() + ").");
			} else {
				System.out.println(prof.getId() + ")La professeure " + prof.getName()
						+ " rajoutée à la base (matricule " + prof.getId() + ").");
			}
		}
	}

	// delete professor (we choose a professor):
	public void deleteProfessor(Professor ProfToDelete) {

		for (int i = 0; i < professorList.size(); i++) {
			Professor prof = (Professor) professorList.get(i);
			if (prof.equals(ProfToDelete)) {
				professorList.remove(i);
				if (prof.getGender().equalsIgnoreCase("m")) {
					System.out.println(prof.getId() + ")Le professeur " + prof.getName()
							+ " a été supprimé de la base (matricule" + prof.getId() + ").");
				} else {
					System.out.println(prof.getId() + ")La professeure " + prof.getName()
							+ " a été supprimée de la base (matricule" + prof.getId() + ").");
				}
			}

		}
	}
	
	// delete professor (by registration number):
	public void deleteProfessor(Long matricule) {
		if(matricule != null) {
		for (Professor prof: professorList) {
			if (prof.getId().equals(matricule)) {
				if (prof.getGender().equalsIgnoreCase("m")) {
					System.out.println(prof.getId() + ")Le professeur " + prof.getName()
							+ " a été supprimé de la base (matricule" + prof.getId() + ").");
					professorList.remove(prof);
					break;
				} else {
					System.out.println(prof.getId() + ")La professeure " + prof.getName()
							+ " a été supprimée de la base (matricule" + prof.getId() + ").");
					professorList.remove(prof);
				}
			}
			else {
				System.out.println("Le num�ro de matricule n'existe pas en base");
			}

		}
		}
		else {
			System.out.println("Le num�ro de matricule ne doit pas �tre vide");
		}
	}

	// get professor by id
	public static void getEmployee(Long matricule) {
		System.out.println();
		try {
		for (int i = 0; i < professorList.size(); i++) {
			Professor prof = professorList.get(i);
			if (matricule == prof.getId()) {
				System.out.println("Résultat de la recherche professeur/e : matricule: " 
			            + professorList.get(i).getId() + "; Nom, Prénom: "
						+ professorList.get(i).getName() + "; Sexe: "
						+ professorList.get(i).getGender() + "; Année Naissance: "
						+ professorList.get(i).getBirthYear() + "; Salaire: "
						+ professorList.get(i).getSalary() + "; Cours Enseigné: "
						+ professorList.get(i).getTeachedCourse());
			}}}
			catch(Exception e){
				System.out.println("Résultat de la recherche professeur/e: le professeur avec le matricule" + matricule + "n'existe pas dans la base");
			}
		}

	public static void genderProfessor(String gender){
	switch(gender)
	{
	case "m":
	System.out.println("Résultat de la recherche civilité: Monsieur");
	break;
	case "f":
	System.out.println("Résultat de la recherche civilité:Madame");
	break;
	}
	}
	
	
}
