package Question1A;

public class Student implements IPerson {
	private String studetID;
	private int grade;
	
	public Student(String studetID, int grade) {
		this.studetID = studetID;
		this.grade = grade;
	}

	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Student ID : " + this.studetID);
		System.out.println("Student Grade : " + this.grade);
		return null;
	}

}
