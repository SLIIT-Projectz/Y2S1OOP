package Question3;

public class CarFactory implements VehicleFactory {
	private static CarFactory cf = null;
	
	public static CarFactory getInstance() {
		if(cf == null) {
			synchronized (CarFactory.class) {
				if(cf == null) {
					cf = new CarFactory();
				}
			}
		}
		
		return cf;
	}

	@Override
	public ICar getModel(String car) {
		// TODO Auto-generated method stub
		if(car == "BMW") {
			return BMW.getInstance();
		} else if(car == "Benz") {
			return Benz.getInstance();
		} else if(car == "RollsRoys") {
			return RollsRoys.getInstance();
		} else {
			return null;
		}
	}

}
