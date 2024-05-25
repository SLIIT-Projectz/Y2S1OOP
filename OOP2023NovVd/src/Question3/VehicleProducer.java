package Question3;

public class VehicleProducer {
	public static VehicleFactory getVehicle(String type) {
		if(type == "Car") {
			return CarFactory.getInstance();
		} else if(type == "Bus") {
			return BusFactory.getInstance();
		} else {
			return null;
		}
		
	}
}
