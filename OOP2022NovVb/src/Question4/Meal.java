package Question4;

public abstract class Meal {
	IPrepareQuickly ipq;
	IPrepareDeliciously ipd;
	
	public void setFlavour(IPrepareDeliciously ipd) {
		this.ipd = ipd;
	}
	
	public void setDuration(IPrepareQuickly ipq) {
		this.ipq = ipq;
	}
	
	public void mealWithFlavour() {
		ipd.addFlavour();
	}
	
	public void mealInDuration() {
		ipq.deliveryTime();
	}
	
	public abstract void displayMeal();
	public abstract void displayCost();
	
}
