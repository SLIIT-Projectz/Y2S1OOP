package Question1B;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory in = new Inventory();
		
		in.addProduct("P001", "Product one", 8, 20.0);
		in.addProduct("P002", "Product two", 7, 10.0);
		in.addProduct("P003", "Product three", 6, 25.0);
		in.addProduct("P004", "Product four", 5, 15.0);
		in.addProduct("P005", "Product five", 4, 5.0);
		
		in.displayProduct();
		System.out.println("\n");
		
		in.removeProduct("P002");
		in.removeProduct("P004");
		System.out.println("\n");
		
		in.displayProduct();

	}

}
