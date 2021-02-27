package packProject;

public interface AbstractFactory<T> {
	T create (String employeeType, String name, String gender, int birthYear, int salary, String function);

}
