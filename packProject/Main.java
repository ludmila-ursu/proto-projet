package packProject;

import java.time.LocalDate;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {

		Service service = new Service();
		EmployeeFactory factory = new EmployeeFactory();
		// create administrators

		factory.create("administrator", "Armel Cressin", "m", 1990, 1800, "secrétaire");
		factory.create("administrator", "Louis Dubois", "m", 1950, 2100, "bibliothécaire");
		factory.create("administrator", "Dubois Marcus", "m", 1980, 2000, "magasinier");
		factory.create("administrator", "Manuel DaSilva", "m", 1985, 1850, "directeur de CROUS");
		factory.create("administrator", "Alex Nuage", "m", 1990, 2130, "comptable");
		factory.create("administrator", "Claire Annabelle", "f", 1975, 1850, "chef d'établissement");
		factory.create("administrator", "Postima Ecouata", "f", 1962, 1900, "secrétaire");
		factory.create("administrator", "Kosmos Ghita", "f", 1990, 1900, "conservatrice");
		factory.create("administrator", "Besonieux Eric", "f", 1992, 1950, "adjointe administrative");
		factory.create("administrator", "Carmalia Eva", "f", 1989, 2000, "conseillèe d'administration scolaire");

		// create professors:
		Professor professeurs001 = (Professor) factory.create("professor", "Chevalier Efi", "m", 1993, 2000, "anglais");
		Professor professeurs002 = (Professor) factory.create("professor", "Bouton Antoine", "m", 1985, 2000,
				"alorithmique et programmation");
		Professor professeurs003 = (Professor) factory.create("professor", "Zeta Emilie", "f", 1963, 2000,
				"atelier de l'informaticien");
		Professor professeurs004 = (Professor) factory.create("professor", "Kiwi Jean", "m", 1986, 2000,
				"programmation fonctionnelle");
		Professor professeurs005 = (Professor) factory.create("professor", "Martin Tresse", "m", 1973, 2000,
				"réseaux");
		Professor professeurs006 = (Professor) factory.create("professor", "Poineaut Isabelle", "f", 1984, 2000,
				"logique");
		Professor professeurs007 = (Professor) factory.create("professor", "Duviviez Hélène", "f", 1996, 2000,
				"analyse numérique matricielle");
		Professor professeurs008 = (Professor) factory.create("professor", "Besanote Florence", "f", 1986, 2000,
				"statistiques");
		Professor professeurs009 = (Professor) factory.create("professor", "Blois Thierry", "f", 1987, 2000,
				"algèbre");
		Professor professeurs010 = (Professor) factory.create("professor", "Patrice Philippe", "m", 1975, 2000,
				"modélisation");

		// add professors to a list:
		service.addProfessor(professeurs001);
		service.addProfessor(professeurs002);
		service.addProfessor(professeurs003);
		service.addProfessor(professeurs004);
		service.addProfessor(professeurs005);
		service.addProfessor(professeurs006);
		service.addProfessor(professeurs007);
		service.addProfessor(professeurs008);
		service.addProfessor(professeurs009);
		service.addProfessor(professeurs010);

		// show professors:
		System.out.println();
		System.out.println("Les professeurs présents en base après  rajouts: ");
		for (int i = 0; i < Service.getProfessorList().size(); i++) {
			System.out.println("matricule: " + Service.getProfessorList().get(i).getId() + "; Nom, Prénom: "
					+ Service.getProfessorList().get(i).getName() + "; Sexe: "
					+ Service.getProfessorList().get(i).getGender() + "; Année Naissance: "
					+ Service.getProfessorList().get(i).getBirthYear() + "; Salaire: "
					+ Service.getProfessorList().get(i).getSalary() + "; Cours Enseigné: "
					+ Service.getProfessorList().get(i).getTeachedCourse());
		}

		// delete professors from the list:
		System.out.println();

		service.deleteProfessor(professeurs001);
		service.deleteProfessor(002L);
//		service.deleteProfessor(professeurs003);
//		service.deleteProfessor(professeurs004);
//		service.deleteProfessor(professeurs005);
//		service.deleteProfessor(professeurs006);
//		service.deleteProfessor(professeurs007);
//		service.deleteProfessor(professeurs008);
//		service.deleteProfessor(professeurs009);
//		service.deleteProfessor(professeurs010);

		System.out.println();
		// get array for pyramid of ages:
		System.out.println("Pyramide des �ges pour les professeurs:");
		ArrayList<Integer> tabPyramideAges = new ArrayList<Integer>();
	      LocalDate currentdate = LocalDate.now();
	      int year = currentdate.getYear();
		
		
		for (int i = 0; i < Service.getProfessorList().size(); i++) {
			tabPyramideAges.add(i, year - Service.getProfessorList().get(i).getBirthYear());
		}
		
		for (int age : tabPyramideAges) {
			System.out.println(age);
		};

		// demander au secrétaire de faire affichier la liste des professeurs:
		System.out.println();
		System.out.println("Les professeurs restants après suppressions: ");
		for (int i = 0; i < Service.getProfessorList().size(); i++) {
			System.out.println("matricule: " + Service.getProfessorList().get(i).getId() + "; Nom, Prénom: "
					+ Service.getProfessorList().get(i).getName() + "; Sexe: "
					+ Service.getProfessorList().get(i).getGender() + "; Année Naissance: "
					+ Service.getProfessorList().get(i).getBirthYear() + "; Salaire: "
					+ Service.getProfessorList().get(i).getSalary() + "; Cours Enseigné: "
					+ Service.getProfessorList().get(i).getTeachedCourse());

		}

		// rechercher un/e employé/e en fonction de son matricule:
		Service.getEmployee(01L);

	}
}
