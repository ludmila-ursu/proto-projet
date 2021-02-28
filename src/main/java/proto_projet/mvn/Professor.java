package proto_projet.mvn;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Professor extends Employee {
	public static Long employeeCounter =0L;
	private Long id;
	
	{
		id = ++employeeCounter;
	}
	
	public Professor(String name, String gender, int birthYear, int salary, String teachedCourse) {
		super(name, gender, birthYear, salary, teachedCourse);
	}

	
}

