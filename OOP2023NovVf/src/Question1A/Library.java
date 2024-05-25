package Question1A;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		String title = null;
		
		while(true) {
			System.out.println("Enter the book title to add : ");
			title = sc.nextLine().trim();
			
			if(title.equalsIgnoreCase("done")) {
				break;
			}
			
			q.add(title);
		}
		
		System.out.println("Enter the book title to remove : ");
		title = sc.nextLine().trim();
		
		if(q.contains(title)) {
			q.remove(title);
			System.out.println("Book was succesfully removed\n");
		} else {
			System.out.println("The book doesn't exists in the list\n");
		}
		
		System.out.println("Total number of available books is " + q.size());
		
		for(String ob: q) {
			System.out.println(ob);
		}
		
		sc.close();
	}

}
