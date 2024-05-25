package Question3;

public class Benz implements ICar {
	public static Benz benz = null;
	
	public void displayVehicle() {
		System.out.println("Factory turns out Benz Car");
	}
	
	public void getModel(String model) {
		
	}
	
	public static Benz getInstance() {
		if(benz == null) {
			synchronized(Benz.class) {
				if(benz == null) {
					benz = new Benz();
				}
			}
		}
		
		return benz;
	}
}
