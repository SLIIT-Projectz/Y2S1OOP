package Question1;

public abstract class Person {
	int ID;
	String name;
	
	public Person() {
		this.ID = 0;
		this.name = "";
	}
	
	public Person(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public abstract void DisplayDetails();
}
