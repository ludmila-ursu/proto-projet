package proto_projet.mvn;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Professor extends Employee {
	public static Long profCounter =0L;
	private Long id;
	
	{
		id = ++profCounter;
	}
	
	public Professor(String name, String gender, int birthYear, int salary, String teachedCourse) {
		super(name, gender, birthYear, salary, teachedCourse);
		System.out.println(id + " - in professor constructor");
	}

	
}

