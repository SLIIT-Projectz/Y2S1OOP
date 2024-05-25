package Question2;

public class TATA implements IBus {
	public static TATA tata = null;
	@Override
	public void displayVehicle() {
		// TODO Auto-generated method stub
		System.out.println("TATA Bus");
	}
	
	public static TATA getInstance() {
		if(tata == null) {
			synchronized (TATA.class) {
				if(tata == null) {
					tata = new TATA();
				}
			}
		}
		
		return tata;
	}

}
