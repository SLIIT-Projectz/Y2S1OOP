package Question4;

public class InstitutionManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1;
		Teacher t1; 

		s1 = new Student(001, "Student 1");
		t1 = new Teacher(100, "Teacher 1");
		
		System.out.println("Student Details");
		s1.EnrolledInCourse(new concreteCourse("1", "Course 1"));
		s1.EnrolledInCourse(new concreteCourse("2", "Course 2"));
		s1.EnrolledInCourse(new concreteCourse("3", "Course 3"));
		s1.DisplayDetails();
		
		System.out.println("\nTeachers Details");
		
		t1.TeachCourse(new concreteCourse("4", "four"));
		t1.TeachCourse(new concreteCourse("5", "five"));
		t1.TeachCourse(new concreteCourse("6", "six"));
		t1.DisplayDetails();
	}

}
