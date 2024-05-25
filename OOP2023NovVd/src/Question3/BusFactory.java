package Question3;

public class BusFactory implements VehicleFactory {
	private static BusFactory bf = null;
	
	public BusFactory() {
		
	}
	
	public static BusFactory getInstance() {
		if(bf == null) {
			synchronized (BusFactory.class) {
				if(bf == null) {
					bf = new BusFactory();
				}
			}
		}
		
		return bf;
	}
	
	@Override
	public IBus getModel(String bus) {
		// TODO Auto-generated method stub
		if(bus == "Volvo") {
			return Volvo.getInstance();
		} else if(bus == "Fuso") {
			return Fuso.getInstance();
		} else if(bus == "TATA") {
			return TATA.getInstance();
		} else {
			return null;
		}
	}
}
