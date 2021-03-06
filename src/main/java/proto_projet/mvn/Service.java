package proto_projet.mvn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Service {
	private boolean deleted = false;

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
			System.out.println(genderProfessor(prof.getGender()) + " professeur" + verbAgreement(prof.getGender()) + " " + prof.getName() + "(matricule " + prof.getId()
					+ "), existe déjà dans la base.");
		} else {
			professorList.add(prof);
			System.out.println(prof.getId() + ")" + genderProfessor(prof.getGender()) + " professeur" + verbAgreement(prof.getGender()) + " " + prof.getName()
					+ " a été rajouté" + verbAgreement(prof.getGender()) + " à la base (matricule " + prof.getId() + ").");
		}
	}

	// delete professor (we choose a professor):
	public void deleteProfessor(Professor ProfToDelete) {

		for (int i = 0; i < professorList.size(); i++) {
			Professor prof = professorList.get(i);
			deleted = false;
			if (prof.equals(ProfToDelete)) {
				professorList.remove(i);
				System.out.println(prof.getId() + ")" + genderProfessor(prof.getGender()) + " professeur" + verbAgreement(prof.getGender()) + " " + prof.getName()
							+ " a été supprimé" + verbAgreement(prof.getGender()) + " de la base (matricule" + prof.getId() + ").");
					deleted = true;
					break;
			}

		}
		if (!deleted){
			System.out.println("Le/La professeur/e n'existe pas en base");
			deleted = false;
		}
	}
	
	// delete professor (by registration number):
	public void deleteProfessor(Long matricule) {
		if(matricule != null) {
			deleted = false;
			for (Professor prof: professorList) {
			if (prof.getId().equals(matricule)) {
				System.out.println(prof.getId() + ")" + genderProfessor(prof.getGender()) + " professeur"  + verbAgreement(prof.getGender()) + " "+ prof.getName()
							+ " a été supprimé" + verbAgreement(prof.getGender()) + " de la base (matricule" + prof.getId() + ").");
					professorList.remove(prof);
					break;
			}
		}
		if (!deleted){
				System.out.println("Le num�ro de matricule " + matricule + " n'existe pas en base");
				deleted = false;
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
						+ professorList.get(i).getFunction());
			}}}
			catch(Exception e){
				System.out.println("Résultat de la recherche: aucun enregistrement pour le matricule" + matricule + "n'existe pas en base de données");
			}
		}

	//get pyramid of ages for all professors:
	public static void getPyramidOfAges() {
		ArrayList<Integer> tabPyramideAges = new ArrayList<Integer>();
		LocalDate currentdate = LocalDate.now();
		int year = currentdate.getYear();


		for (int i = 0; i < Service.getProfessorList().size(); i++) {
			tabPyramideAges.add(i, year - Service.getProfessorList().get(i).getBirthYear());
		}

		for (int age : tabPyramideAges) {
			System.out.println(age);
		}
	}

	public static void showList() {
		for (int i = 0; i < Service.getProfessorList().size(); i++) {
			System.out.println("matricule: " + Service.getProfessorList().get(i).getId() + "; Nom, Prénom: "
					+ Service.getProfessorList().get(i).getName() + "; Sexe: "
					+ Service.getProfessorList().get(i).getGender() + "; Année Naissance: "
					+ Service.getProfessorList().get(i).getBirthYear() + "; Salaire: "
					+ Service.getProfessorList().get(i).getSalary() + "; Cours Enseigné: "
					+ Service.getProfessorList().get(i).getFunction());

		}
	}

	private static String genderProfessor(String gender) {
		String gend = null;
		String verbAgreem = null;
		switch (gender) {
			case "m":
				gend = "Le";
			break;
			case "f":
				gend="La";
				verbAgreem = "e";
			break;
			default:
				gend = "Le/La";
		}
		return gend;
	}

	private static String verbAgreement(String gender) {
		if(gender == "f") {
			return "e";
		}
		else{
			return "";
		}
	}
}
