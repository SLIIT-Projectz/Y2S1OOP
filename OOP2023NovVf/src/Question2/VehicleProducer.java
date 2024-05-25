package Question2;

public class VehicleProducer {

	public static VehicleFactory getVehicle(String vehicle) {
		System.out.print("Factory turns out ");
		if(vehicle == "Car") {
			return CarFactory.getInstance();
		} else if(vehicle == "Bus") {
			return BusFactory.getInstance();
		} else {
			return null;
		}
	}

}
