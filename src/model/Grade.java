package model;

public class Grade {
	private long id;
	private int gradeValue;
	private Student student;
	private Course course;
	private static long gradeCounter = 3000;
	
	//getters setters
	public long getId() {
		return id;
	}
	public void setId() {
		id = gradeCounter++;
	}
	public int getGradeValue() {
		return gradeValue;
	}
	public void setGradeValue(int gradeValue) {
		if (gradeValue > 1 && gradeValue <= 10) {
			this.gradeValue = gradeValue;
		} else {
			this.gradeValue = 1;
		}
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		if (student != null) {
			this.student = student;
		} else {
			this.student = new Student();
		}
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		if (course != null) {
			this.course = course;
		} else {
			this.course = new Course();
		}
	}
	
	//Constr
	public Grade() {
		setId();
		setGradeValue(1);
		setStudent(new Student());
		setCourse(new Course());
	};
	public Grade(int gradeValue, Student student, Course course) {
		setId();
		setGradeValue(gradeValue);
		setStudent(student);
		setCourse(course);
	};
	
}
