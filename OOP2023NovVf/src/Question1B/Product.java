package Question1B;

public class Product {
	private String productName;
	private int quality;
	private double pricePerUnit;
	public Product(String productName, int quality, double pricePerUnit) {
		super();
		this.productName = productName;
		this.quality = quality;
		this.pricePerUnit = pricePerUnit;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	 @Override
	    public String toString() {
	        return "Product Name: " + productName + ", Quality: " + quality + ", Price per Unit: " + pricePerUnit;
	    }
	
}
