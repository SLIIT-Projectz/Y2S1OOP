package Question3;

public class BMW implements ICar {
	private static BMW bmw = null;
	
	public void displayVehicle() {
		System.out.println("Factory turns out BMW Car");
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
