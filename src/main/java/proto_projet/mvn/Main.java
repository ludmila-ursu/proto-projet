package proto_projet.mvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Main {


	public static void main(String[] args) {

		ConfigurableApplicationContext contextAppl = SpringApplication.run(Main.class, args);

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		Service service = (Service) beanFactory.getBean("service");

		// create administrators
		FactoryEnum factory = FactoryEnum.ADMINISTATOR_TYPE;
		factory.create("Armel Cressin", "m", 1990, 1800, "secrétaire");
		factory.create("Louis Dubois", "m", 1950, 2100, "bibliothécaire");
		factory.create("Dubois Marcus", "m", 1980, 2000, "magasinier");
		factory.create( "Manuel DaSilva", "m", 1985, 1850, "directeur de CROUS");
		factory.create("Alex Nuage", "m", 1990, 2130, "comptable");
		factory.create("Claire Annabelle", "f", 1975, 1850, "chef d'établissement");
		factory.create("Postima Ecouata", "f", 1962, 1900, "secrétaire");
		factory.create("Kosmos Ghita", "f", 1990, 1900, "conservatrice");
		factory.create("Besonieux Eric", "f", 1992, 1950, "adjointe administrative");
		factory.create("Carmalia Eva", "f", 1989, 2000, "conseillèe d'administration scolaire");

		// create professors:
		FactoryEnum factory2 = FactoryEnum.PROFESSOR_TYPE;
		Professor professeurs001 = (Professor) factory2.create("Chevalier Efi", "m", 1993, 2000, "anglais");
		Professor professeurs002 = (Professor) factory2.create("Bouton Antoine", "m", 1985, 2000,
				"alorithmique et programmation");
		Professor professeurs003 = (Professor) factory2.create("Zeta Emilie", "f", 1963, 2000,
				"atelier de l'informaticien");
		Professor professeurs004 = (Professor) factory2.create("Kiwi Jean", "m", 1986, 2000,
				"programmation fonctionnelle");
		Professor professeurs005 = (Professor) factory2.create("Martin Tresse", "m", 1973, 2000,
				"réseaux");
		Professor professeurs006 = (Professor) factory2.create("Poineaut Isabelle", "f", 1984, 2000,
				"logique");
		Professor professeurs007 = (Professor) factory2.create("Duviviez Hélène", "f", 1996, 2000,
				"analyse numérique matricielle");
		Professor professeurs008 = (Professor) factory2.create("Besanote Florence", "f", 1986, 2000,
				"statistiques");
		Professor professeurs009 = (Professor) factory2.create("Blois Thierry", "f", 1987, 2000,
				"algèbre");
		Professor professeurs010 = (Professor) factory2.create("Patrice Philippe", "m", 1975, 2000,
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
		service.showList();

		// delete professors from the list:
		System.out.println();

		service.deleteProfessor(professeurs001);
		service.deleteProfessor(professeurs004);
		service.deleteProfessor(professeurs005);
		service.deleteProfessor(professeurs006);
		service.deleteProfessor(20L);

		System.out.println();
		// get array for pyramid of ages:
		System.out.println("Pyramide des âges pour les professeurs:");
		service.getPyramidOfAges();

		// demander au secrétaire de faire affichier la liste des professeurs:
		System.out.println();
		System.out.println("Les profess" +
				".eurs restants après suppressions: ");
		service.showList();

		// rechercher un/e employé/e en fonction de son matricule:
		service.getEmployee(01L);

	}



}
