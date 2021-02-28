package proto_projet.mvn;

public class Administrator extends Employee {
	private static int adminCounter = 0;
	private int nbAdmin;
	{
		nbAdmin = adminCounter++;
	}
	public Administrator(String name, String gender, int birthYear, int salary, String function) {
		super(name, gender, birthYear, salary, function);
		System.out.println(nbAdmin + " - in administrator constructor");

	}
}
