package Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		List<String> emp = new ArrayList<>();
		String name;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the employee name : ");
			name = sc.nextLine().trim();
			
			if(name.equalsIgnoreCase("done")) {
				break;
			}
			
			emp.add(name);
		}
		
		System.out.println("Enter the name of the Employee to remove : ");
		name = sc.nextLine();
		
		if(emp.contains(name)) {
			emp.remove(name);
			System.out.println("Employee name has been succesfully removed!");
		} else {
			System.out.println("Employee name unavailable in the list!");
		}
		
		System.out.println("Total number of employees : " + emp.size());
		
		System.out.println("Employee name : ");
		for(String ob: emp) {
			System.out.println(ob);
		}
		
		sc.close();
	}

}
