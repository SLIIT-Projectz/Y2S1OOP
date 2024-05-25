package Question3;

import java.util.Scanner;

public class Main {
	private static String pattern1;
	private static String pattern2;
	private static int count;
	private static Object lock = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Pattern 1 = ");
		pattern1 = sc.nextLine();
		System.out.print("Enter Pattern 2 = ");
		pattern2 = sc.nextLine();
		System.out.println("Enter Count = ");
		count = sc.nextInt();
		
		System.out.println("=======Threads start printing pattern.=======");
		Pattern01 p1 = new Pattern01(lock, pattern1, count);
		Pattern02 p2 = new Pattern02(lock, pattern2, count);
		p1.start();
		p2.start();
		
		try {
			p1.join();
			p2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
