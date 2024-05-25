package Question2;

public class Fuso implements IBus {
	public static Fuso fuso = null;
	
	@Override
	public void displayVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Fuso Bus");
	}
	
	public static Fuso getInstance() {
		if(fuso == null) {
			synchronized (Fuso.class) {
				if(fuso == null) {
					fuso = new Fuso();
				}
			}
		}
		
		return fuso;
	}

}
