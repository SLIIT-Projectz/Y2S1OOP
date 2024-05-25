package Question2;

public class Volvo implements IBus {
	public static Volvo volvo = null;
	
	@Override
	public void displayVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Volvo Bus");
	}
	
	public static Volvo getInstance() {
		if(volvo == null) {
			synchronized (Volvo.class) {
				if(volvo == null) {
					volvo = new Volvo();
				}
			}
		}
		
		return volvo;
	}

}
