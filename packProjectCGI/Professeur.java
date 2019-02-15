package packProjectCGI;

public class Professeur extends Employee {
	String nombre;
	String coursEnseigne;

	public Professeur (String nombre, String nom, String sexe, int anneeNaissance, int salaire, String coursEnseigne){
		super(nom, sexe,  anneeNaissance, salaire); 
		this.nombre=nombre;
		this.nom=nom;
		this.sexe=sexe;
		this.salaire=salaire;
		this.coursEnseigne=coursEnseigne;
	}

	public String getNom() {
		return nom;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCoursEnseigne() {
		return coursEnseigne;
	}

	public void setCoursEnseigne(String coursEnseigne) {
		this.coursEnseigne = coursEnseigne;
	}

	public String getSexe() {
		return sexe;
	}
}