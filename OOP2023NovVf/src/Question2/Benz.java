package Question2;

public class Benz implements ICar {
	public static Benz ben = null;
	
	@Override
	public void displayVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Benz Car");
	}
	
	public static Benz getInstance() {
		if(ben == null) {
			synchronized (Benz.class) {
				if(ben == null) {
					ben = new Benz();
				}
			}
		}
		
		return ben;
	}

}
