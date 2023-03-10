package service;

import model.Degree;
import model.Faculty;
import model.CourseGradeType;
import model.Student;
import model.Professor;
import model.Course;

public class MainService {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		
		Student st2 = new Student("Harvey", "Bērziņš", Faculty.ITF, "131199-12345");
		System.out.println(st2);
		
		Student st3 = new Student("Harv123ey", "Bēr43ziņš", Faculty.ITF, "13z199-12345");
		System.out.println(st3);
		
		Professor pr1 = new Professor();
		System.out.println(pr1);
		Professor pr2 = new Professor("Karina", "Skirmante", Faculty.ITF, "121212-11123");
		System.out.println(pr2);
		Professor pr3 = new Professor("Galina", "Hilkevica", Faculty.ITF, "814532-32557");
		System.out.println(pr3);
		
		Course c1 = new Course();
		System.out.println(c1);
		Course c2 = new Course("Programmesana timekli JAVA", 4, CourseGradeType.EXAM, pr2);
		System.out.println(c2);
		Course c3 = new Course("Matematika", 2, CourseGradeType.EXAM, pr3);
		System.out.println(c3);
		Course c4 = new Course("DataStrukt", 2, CourseGradeType.EXAM, pr2);
		System.out.println(c4);
	}
}
