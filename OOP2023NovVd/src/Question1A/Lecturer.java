package Question1A;

public class Lecturer implements IPerson {
	private String employeeID, department;

	public Lecturer(String employeeID, String department) {
		super();
		this.employeeID = employeeID;
		this.department = department;
	}

	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee ID : " + this.employeeID);
		System.out.println("Department : " + this.department);
		return null;
	}
	
	
}
