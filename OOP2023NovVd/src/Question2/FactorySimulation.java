package Question2;

/*
 * 
 * 
 * sorry this code isn't working well yet ... so don't study ... 
 * if you can ... you may contribute
 * 
 * 
 * 
 */

public class FactorySimulation {
	private static Object lock = new Object();
	private static int totIron = 0;
	private static int totWood = 0;
	private static int totCement = 0;
	
	public static void main(String[] args) {
		SupplierIron si = new SupplierIron(lock);
		SupplierWood sw = new SupplierWood(lock);
		SupplierCement sc = new SupplierCement(lock);
		ProductionLine pl = new ProductionLine(lock);

		si.start();
		sw.start();
		sc.start();
		pl.start();
		
		try {
			si.join();
			sw.join();
			sc.join();
			pl.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 	public static int getTotIron() {
	        return totIron;
	    }

	    public static int getTotWood() {
	        return totWood;
	    }

	    public static int getTotCement() {
	        return totCement;
	    }

	    public static void incrementIron() {
	        totIron++;
	        System.out.println("Iron Inventory: " + totIron);
	    }

	    public static void incrementWood() {
	        totWood++;
	        System.out.println("Wood Inventory: " + totWood);
	    }

	    public static void incrementCement() {
	        totCement++;
	        System.out.println("Cement Inventory: " + totCement);
	    }

	    public static void decrementIron() {
	        totIron--;
	    }

	    public static void decrementWood() {
	        totWood--;
	    }

	    public static void decrementCement() {
	        totCement--;
	    }
	

}
