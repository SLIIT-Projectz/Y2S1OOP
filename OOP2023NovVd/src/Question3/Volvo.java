package Question3;

public class Volvo implements IBus {
	private static Volvo v = null;
	
	public void displayVehicle() {
		System.out.println("Factory rolls out Volvo Bus");
	}

	public static Volvo getInstance() {
		if(v == null) {
			synchronized (Volvo.class) {
				if(v == null) {
					v = new Volvo();
				}
			}
		}
		
		return v;
	}
}
