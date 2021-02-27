package packProject;

public class Employee {
	String name, gender, teachedCourse;
	int salary, birthYear;

	public Employee(String name, String gender, int birthYear, int salary, String teachedCourse) {
		this.name = name;
		this.gender = gender;
		this.birthYear = birthYear;
		this.salary = salary;
		this.teachedCourse = teachedCourse;
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
		return teachedCourse;
	}

	public void setFunction(String teachedCourse) {
		this.teachedCourse = teachedCourse;
	}

	
}
