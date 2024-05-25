package Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {
	String CourseId, name, instructor;
	List<Student> studentList= new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public Course() {
		this.CourseId = "";
		this.name = "";
		this.instructor = "";
	}
	
	public void Read() {
		System.out.println("Enter the Course ID:");
		this.CourseId = sc.nextLine();
		System.out.println("Enter the Course Name: ");
		this.name = sc.nextLine();
		System.out.println("Enter Instructor's Name: ");
		this.instructor = sc.nextLine();
	}
	
	public void AddStudent(Student ob) {
		studentList.add(ob);
	}
	
	public void Print() {
		System.out.println("Course ID: " + this.CourseId);
		System.out.println("Course Name: " + this.name);
		System.out.println("Instructor: " + this.instructor);
		
		System.out.println("Enrolled Students: ");
		
		for(Student s: studentList) {
			System.out.println(s.getStudentName());
		}
	}
}
