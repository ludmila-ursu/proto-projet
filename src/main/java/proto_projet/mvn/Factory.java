package proto_projet.mvn;

public interface Factory<Employee> {
	 Employee create (String name, String gender, int birthYear, int salary, String function);

}
