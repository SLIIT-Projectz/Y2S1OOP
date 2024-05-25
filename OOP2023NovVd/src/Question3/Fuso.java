package Question3;

public class Fuso implements IBus {
	private static Fuso f = null;
	
	public void displayVehicle() {
		System.out.println("Factory rolls out Fuso Bus");
	}

	public static Fuso getInstance() {
		if(f == null) {
			synchronized (Fuso.class) {
				if(f == null) {
					f = new Fuso();
				}
			}
		}
		
		return f;
	}
}
