package service;

import model.Degree;
import model.Faculty;
import model.Grade;
import model.CourseGradeType;
import model.Student;
import model.Professor;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;

public class MainService {

	public static void main(String[] args) {
		
		//TODO create 4 arrays, one for each and add all elements
		//TODO print out all elements
		Professor[] allProfessors = new Professor[6];
		Course[] allCourses = new Course[6];
		Grade[] allGrades = new Grade[6];
		
		Student st1 = new Student();
		Student st2 = new Student("Harvey", "Bērziņš", Faculty.ITF, "131199-12345");
		Student st3 = new Student("Andris", "Cielavs", Faculty.ITF, "13z199-12345");
		/*Student[] allStudents = {st1, st2, st3};
		for(Student temp : allStudents) {
			System.out.println(temp);
		}*/
		
		ArrayList<Student> allStudentsList = new ArrayList<>();
		allStudentsList.addAll(Arrays.asList(st1, st2, st3));
		for(Student temp : allStudentsList) {
			System.out.println(temp);
		}
		
		Professor pr1 = new Professor();
		Professor pr2 = new Professor("Karina", "Skirmante", Faculty.ITF, "121212-11123");
		Professor pr3 = new Professor("Galina", "Hilkevica", Faculty.ITF, "814532-32557");
		ArrayList<Professor> allProfessorsList = new ArrayList<>();
		allProfessorsList.addAll(Arrays.asList(pr1, pr2, pr3));
		for(Professor temp : allProfessorsList) {
			System.out.println(temp);
		}
		
		Course c1 = new Course();
		Course c2 = new Course("Programmesana timekli JAVA", 4, CourseGradeType.EXAM, pr2);
		Course c3 = new Course("Matematika", 2, CourseGradeType.EXAM, pr3);
		Course c4 = new Course("DataStrukt", 2, CourseGradeType.EXAM, pr2);
		ArrayList<Course> allCoursesList = new ArrayList<>();
		allCoursesList.addAll(Arrays.asList(c1, c2, c3, c4));
		for(Course temp : allCoursesList) {
			System.out.println(temp);
		}
		
		Grade g1 = new Grade();
		Grade g2 = new Grade(10, st2, c2);
		Grade g3 = new Grade(1, st3, c3);
		ArrayList<Grade> allGradesList = new ArrayList<>();
		allGradesList.addAll(Arrays.asList(g1, g2, g3));
		for(Grade temp : allGradesList) {
			System.out.println(temp);
		}
	}
}
