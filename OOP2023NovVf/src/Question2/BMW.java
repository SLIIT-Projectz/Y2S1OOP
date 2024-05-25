package Question2;

public class BMW implements ICar {
	public static BMW bmw = null;
	
	@Override
	public void displayVehicle() {
		System.out.println("BMW Car");
	}
	
	public static BMW getInstance() {
		if(bmw == null) {
			synchronized (BMW.class) {
				if(bmw == null) {
					bmw = new BMW();
				}
			}
		}
		
		return bmw;
	}

}
