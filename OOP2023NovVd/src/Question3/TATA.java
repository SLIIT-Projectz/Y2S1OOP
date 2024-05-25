package Question3;

public class TATA implements IBus {
	private static TATA t = null;
	
	public void displayVehicle() {
		System.out.println("Factory rolls out TATA Bus");
	}

	public static TATA getInstance() {
		if(t == null) {
			synchronized (TATA.class) {
				if(t == null) {
					t = new TATA();
				}
			}
		}
		
		return t;
	}
}
