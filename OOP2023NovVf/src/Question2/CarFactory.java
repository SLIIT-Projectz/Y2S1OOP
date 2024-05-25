package Question2;

public class CarFactory implements VehicleFactory {
	private static CarFactory carFactory = null;
	
	public static CarFactory getInstance() {
		if(carFactory == null) {
			synchronized (CarFactory.class) {
				if(carFactory == null) {
					carFactory = new CarFactory();
				}
			}
		}
		
		return carFactory;
	}

	@Override
	public ICar getModel(String type) {
		// TODO Auto-generated method stub
		switch(type) {
		case "BMW":
			return BMW.getInstance();
		case "Benz":
			return Benz.getInstance();
		case "RollsRoys":
			return RollsRoys.getInstance();
		default:
			return null;
		}
	}
}
