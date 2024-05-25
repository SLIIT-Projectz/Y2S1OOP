package Question1A;

import java.util.ArrayList;

public class GenericPerson<T extends IPerson> {
	public void displayElements(ArrayList<T> person) {
		// TODO Auto-generated method stub
		for(T ob: person) {
			ob.displayDetails();
		}
	}
}
