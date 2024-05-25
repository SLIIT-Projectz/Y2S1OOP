package Question1;

public class InstitutionManagementApp {

	public static void main(String[] args) {				
		Student ob1 = new Student(001, "sname1");
		Teacher ob2 = new Teacher(1000, "tname1");
		
		Course c1 = new concreteCourse("scoursecode1", "scoursename1");
		Course c2 = new concreteCourse("tcoursecode1", "tcoursename1");
		
		ob1.EnrollInCourses(c1);
		ob2.TeachCourse(c2);
		
		System.out.println("Student Details");
		ob1.DisplayDetails();
		
		System.out.println("\nTeachers Details");
		ob2.DisplayDetails();

	}

}
