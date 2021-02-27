package packProject;

public class Employee {
	String name, gender, function;
	int salary, birthYear;

	public Employee(String name, String gender, int birthYear, int salary, String function) {
		this.name = name;
		this.gender = gender;
		this.birthYear = birthYear;
		this.salary = salary;
		this.function = function;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	
}
