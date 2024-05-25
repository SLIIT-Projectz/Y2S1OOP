package Question1;

public class StudentApp {

	public static void main(String[] args) {
		Student obs1 = new Student();
		Course obc1 = new Course();
		
		obs1.Read();
		obc1.Read();
		obc1.AddStudent(obs1);
		
		System.out.println("Student Information: ");
		obs1.Print();
		
		System.out.println("\nCourse Information: ");
		obc1.Print();
	}

}
