package Question2;

public class BusFactory implements VehicleFactory {
	public static BusFactory busFactory = null;
	
	public static BusFactory getInstance() {
		if(busFactory == null) {
			synchronized (BusFactory.class) {
				if(busFactory == null) {
					busFactory = new BusFactory();
				}
			}
		}
		
		return busFactory;
	}

	@Override
	public IBus getModel(String type) {
		// TODO Auto-generated method stub
		if(type == "Volvo")
			return Volvo.getInstance();
		else if(type == "Fuso")
			return Fuso.getInstance();
		else if(type == "TATA")
			return TATA.getInstance();
		else
			return null;
	}
}
