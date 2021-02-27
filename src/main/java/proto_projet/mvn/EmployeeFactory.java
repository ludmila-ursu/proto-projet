package proto_projet.mvn;

public class EmployeeFactory implements AbstractFactory<Employee> {

	@Override
	public Employee create(String employeeType, String name, String gender, int birthYear, int salary, String function) {
		if ("Administrator".equalsIgnoreCase(employeeType)) {
			return new Administrator(name, gender, birthYear, salary, function);
		}
		else if ("Professor".equalsIgnoreCase(employeeType)) {
			return new Professor(name, gender, birthYear, salary, function);

		}
		else {
			System.out.println("this type of Employee is not defined");
			return null;
		}
	}

}
