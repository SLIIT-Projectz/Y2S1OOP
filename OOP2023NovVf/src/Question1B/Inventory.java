package Question1B;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
	Map<String, Product> m = new HashMap<>();
	
	public void addProduct(String productCode, String productName, int quality, double price) {
		Product product = new Product(productName, quality, price);
		m.put(productCode, product);
	}
	
	public void removeProduct(String productCode) {
		m.remove(productCode);
		System.out.println("Product has been removed.");
	}
	
	public void displayProduct() {
		for(String p: m.keySet()) {
			System.out.println("Product Code : " + p + "\nDetails : " + m.get(p));
		}
	}

}
