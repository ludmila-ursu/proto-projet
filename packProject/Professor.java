package packProject;

public class Professor extends Employee {
	public static Long employeeCounter =0L;
	private Long id;
	
	{
		id = ++employeeCounter;
	}
	
	public Professor(String name, String gender, int birthYear, int salary, String teachedCourse) {
		super(name, gender, birthYear, salary, teachedCourse);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTeachedCourse() {
		return teachedCourse;
	}
	public void setTeachedCourse(String teachedCourse) {
		this.teachedCourse = teachedCourse;
	}
	
	
}

