package Question3;

public class VehicleSelectionDemo {
	private static final String CAR = "Car";
	private static final String BUS = "Bus";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		((ICar) VehicleProducer.getVehicle(CAR).getModel("RollsRoys")).displayVehicle();
		((ICar) VehicleProducer.getVehicle(CAR).getModel("Benz")).displayVehicle();
		((ICar) VehicleProducer.getVehicle(CAR).getModel("BMW")).displayVehicle();
		
		((IBus) VehicleProducer.getVehicle(BUS).getModel("Volvo")).displayVehicle();
		((IBus) VehicleProducer.getVehicle(BUS).getModel("Fuso")).displayVehicle();
		((IBus) VehicleProducer.getVehicle(BUS).getModel("TATA")).displayVehicle();
		
	}

}
