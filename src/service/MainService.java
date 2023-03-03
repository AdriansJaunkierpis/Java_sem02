package service;

import model.Faculty;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		
		Student st2 = new Student("Harvey", "Bērziņš", Faculty.ITF, "131199-12345");
		System.out.println(st2);
		
		Student st3 = new Student("Harv123ey", "Bēr43ziņš", Faculty.ITF, "13z199-12345");
		System.out.println(st3);
	}
}
