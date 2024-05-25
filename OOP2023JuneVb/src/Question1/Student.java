package Question1;

import java.util.Scanner;

public class Student {
	private String StudentId, name, address, contactNumber;
	Scanner sc = new Scanner(System.in);
	
	public Student() {
		this.StudentId = "";
		this.name = "";
		this.address = "";
		this.contactNumber = "";
	}
	
	public void Read() {	
		System.out.println("Enter Student ID : ");
		this.StudentId = sc.nextLine();
		System.out.println("Enter Student name : ");
		this.name = sc.nextLine();
		System.out.println("Enter Student address : ");
		this.address = sc.nextLine();
		System.out.println("Enter Student contact number : ");
		this.contactNumber = sc.next();
	}
	
	public void Print() {
		System.out.println("Student ID: " + this.StudentId);
		System.out.println("Student Name: " + this.name);
		System.out.println("Student Address: " + this.address);
		System.out.println("Student Contact no: " + this.contactNumber);
	}
	
	public String getStudentName() {
		return this.name;
	}
}
