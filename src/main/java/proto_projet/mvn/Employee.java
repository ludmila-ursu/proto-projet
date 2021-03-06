package proto_projet.mvn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class Employee {
	private static int counter = 0;
	private String name, gender, function;
	private int salary, birthYear, nb;
	{
		nb = counter++;
	}

	public Employee(String name, String gender, int birthYear, int salary, String function) {
		this.name = name;
		this.gender = gender;
		this.birthYear = birthYear;
		this.salary = salary;
		this.function = function;

	}


}
