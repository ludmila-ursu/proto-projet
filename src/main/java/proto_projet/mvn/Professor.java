package proto_projet.mvn;

public class Professor extends Employee {
	public static Long employeeCounter =0L;
	private Long id;
	
	{
		id = ++employeeCounter;
	}
	
	public Professor(String name, String gender, int birthYear, int salary, String teachedCourse) {
		super(name, gender, birthYear, salary, teachedCourse);
	}

	public static Long getEmployeeCounter() {
		return employeeCounter;
	}

	public static void setEmployeeCounter(Long employeeCounter) {
		Professor.employeeCounter = employeeCounter;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}

